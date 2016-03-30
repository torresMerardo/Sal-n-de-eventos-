/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author andres
 */
public class Event {
    private String name;         /** Attribute client */
    private String customerDocument;    /** Used ID document storage */    
    private String foodEvent ;         /** Utilisara food being at the event */   
    private String decorOfTheEvent;     /** The type of decoration that the customer uses for the event */       
 
    
   /**
     * Default constructor
     * 
     */
    
    public Event (){
        this.name= "";
        this.customerDocument="";
        this.foodEvent = "";
        this.decorOfTheEvent="";
    }
    /**   
     * Parameterized constructor
     * @param name  Attribute client 
     * @param customerDocument Used ID document storage
     * @param foodEvent Utilisara food being at the event
     * @param decorOfTheEvent  The type of decoration that the customer uses for the event
     * 
     */
    public Event (String name, String customerDocument, String footEvent, String decorOfTheEvent){
        this.name=name;
        this.customerDocument=customerDocument;
        this.foodEvent= foodEvent;
        this.decorOfTheEvent= decorOfTheEvent;
        
        
       /**
        * gets as theCustomer name
        * return Name of the employee
        */
}   
        public String getName() {
        return name;
    }
/**
 * renames client
 * @param name Customer name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * gets as the CustomerDocument
 * @return CustomerDocument of the client
 */
    public String getCustomerDocument() {
        return customerDocument;
    }
/**
 * renames customerDocument of the client
 * @param customerDocument 
 */
    public void setCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }
/**
 * 
 * gets as the FoodEvent
 * @return FoodEvent
 */
    public String  getFoodEvent() {
        return foodEvent;
    }
/**
 * renames foodEvent of the client
 * @param foodEvent 
 */
    public void setFoodEvent(String  foodEvent) {
        this.foodEvent = foodEvent;
    }
/**
 * gets as the DecorOfTheEvent
 * @return DecorOfTheEvent
 */
    public String  getDecorOfTheEvent() {
        return decorOfTheEvent;
    }
/**
 *  
 * renames decorOfTheEvent of the client
 * @param decorOfTheEvent 
 */
    public void setDecorOfTheEvent(String decorOfTheEvent) {
        this.decorOfTheEvent = decorOfTheEvent;
    }

    public void setName(String string, String tagValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
