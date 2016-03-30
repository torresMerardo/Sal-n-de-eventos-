package Event.persistence;



import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import principal.CashReserves;
import principal.CreditMoney;
import principal.Event;
import principal.IncomeExpensesOfTheMonth;

/**
 *
 * @author Docente
 */
public class XMLFile {
    private DocumentBuilderFactory docFactory;
    private DocumentBuilder docBuilder;
    private Object event;

    /**
     * Default constructor
     */
    public XMLFile() {
    }

    /**
     * Get Document Builder Factory
     * @return Document Builder Factory
     */
    public DocumentBuilderFactory getDocFactory() {
        return docFactory;
    }

    /**
     * Set Document Builder Factory
     * @param docFactory Document Builder Factory
     */
    public void setDocFactory(DocumentBuilderFactory docFactory) {
        this.docFactory = docFactory;
    }

    /**
     * Get Document Builder
     * @return Document Builder
     */
    public DocumentBuilder getDocBuilder() {
        return docBuilder;
    }

    /**
     * Set Document Builder
     * @param docBuilder Document Builder
     */
    public void setDocBuilder(DocumentBuilder docBuilder) {
        this.docBuilder = docBuilder;
    }

    /**
     * Read a xml file of employees and create a employee list
     * @param filename XML filename
     * @return Employee list
     */
    public List<Event> readFile(String filename) {
        List<Event> eventList = new ArrayList<>();
        
        try {
            this.setDocFactory(DocumentBuilderFactory.newInstance());
            this.setDocBuilder(this.getDocFactory().newDocumentBuilder());
            Document doc = this.getDocBuilder().newDocument();
            
            Element rootElement = doc.getDocumentElement();
            NodeList xmlList = rootElement.getElementsByTagName("Event");
            
            if (xmlList != null && xmlList.getLength() > 0) {
                for (int i = 0; i < xmlList.getLength(); i++) {
                    Element xmlElement = (Element)xmlList.item(i);
                   Event event = getEvent(xmlElement);
                    eventList.add(event);
                }
            }
        } catch (ParserConfigurationException | NullPointerException ex) {
            Logger.getLogger(XMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eventList;
    }

    /**
     * Write file (XML format)
     * @param filename XML filename
     * @param employeeList Employee list to save
     */
    public void writeFile(String filename, List<Event> EventList) {
        try {
            this.setDocFactory(DocumentBuilderFactory.newInstance());
            this.setDocBuilder(this.getDocFactory().newDocumentBuilder());
            
            Document doc = this.getDocBuilder().newDocument();
            Element rootElement = doc.createElement("Events");
            doc.appendChild(rootElement);
           // Iterable<Event> EventList;
            
            for (Event event : EventList) {
                rootElement.appendChild(getEvent(doc, event));
            }
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename));
            transformer.transform(source, result);
        } catch (ParserConfigurationException | TransformerConfigurationException ex) {
            Logger.getLogger(XMLFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Build employee xml record
     * @param doc Document
     * @param Event Employee 
     * @return Employee element node
     */
    private Node getEvent(Document doc, Event event) {
      Element xmlEvent = doc.createElement("Events");
      xmlEvent.setAttribute("Name", "" + event.getName()); 
      xmlEvent.setAttribute("Document","" + event.getCustomerDocument());
      xmlEvent.setAttribute("FoodEv",""+ event .getFoodEvent());
      xmlEvent.setAttribute("DecorationEv",""+event.getDecorOfTheEvent());
        
    
    

        return xmlEvent;
    }

    /**
     * Build employee xml field
     * @param doc Document
     * @param xmlEvent Employee xml element
     * @param tagName Tag name
     * @param tagValue Tag value
     * @return Employee file node
     */
    private Node getEventNode(Document doc, Element xmlEvent, String tagName, String tagValue) {
        Element node = doc.createElement(tagName);
        node.appendChild(doc.createTextNode(tagValue));
        return node;
    }

    private Event getEvent(Element xmlElement) {
         Event event = new Event();
      
        event.setName(getTagValue(xmlElement, "name"));
         event.setCustomerDocument(getTagValue(xmlElement, "document"));
         event.setFoodEvent(getTagValue(xmlElement, "FoodEv"));
         event.setDecorOfTheEvent(getTagValue(xmlElement, "DecorationEv"));
         
        return event;
        
         }
     private Node getCashReserves (Document doc, CashReserves cashReserves){
         Element xmlCashReserves = doc.createElement("xmlCashReserves");
         xmlCashReserves.setAttribute("ReserMo", "" +cashReserves.getReseveMoney());
         xmlCashReserves.setAttribute("BackupUtil","" + cashReserves.getReserveUnit());
        return xmlCashReserves;
      }
      private Node getCreditMoney (Document doc, CreditMoney creditMoney){
     Element xmlCreditMoney = doc.createElement("CreditMoney");
      xmlCreditMoney.setAttribute("CReditBank", "" + creditMoney.getBankCredit()); 
      xmlCreditMoney.setAttribute("CReditUnit","" + creditMoney.getCreditUnit());
      xmlCreditMoney.setAttribute("MoneyCredit",""+ creditMoney.getCreditMoney());
      xmlCreditMoney.setAttribute("TypeDedt",""+creditMoney.getRateDebt());   
    
    return  xmlCreditMoney;
    }
      private Node getIncomeExpensesOfTheMonth (Document doc,IncomeExpensesOfTheMonth incomeExpensesOfTheMonth){
       Element xmlIncomeExpensesOfTheMonth  = doc.createElement("IncomeExpensesOfTheMonth ");   
       xmlIncomeExpensesOfTheMonth.setAttribute("IncodeMoney",""+ incomeExpensesOfTheMonth.getIncodeMonth());
       xmlIncomeExpensesOfTheMonth.setAttribute("MoOutflows", ""+incomeExpensesOfTheMonth.getMonthEarnings());
       xmlIncomeExpensesOfTheMonth.setAttribute("EaningMonth",""+incomeExpensesOfTheMonth.getExpensesMonth());
      return xmlIncomeExpensesOfTheMonth;
      }
     
              
   private String getTagValue(Element xmlElement, String tagname) {
        String txtValue = null;
        NodeList nl = xmlElement.getElementsByTagName(tagname);
        if (nl != null && nl.getLength() > 0) {
            Element element = (Element)nl.item(0);
            txtValue = element.getFirstChild().getNodeValue();
        }
        return txtValue;
    }

  
    
}
    

