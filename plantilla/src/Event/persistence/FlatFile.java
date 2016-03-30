/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.CashReserves;

import principal.Event;

/**
 *
 * @author Estudiante
 */
public class FlatFile {
    
  private File file =null;
  private FileReader fr = null;
  private BufferedReader br = null;
  private FileWriter fw = null;
  private PrintWriter pw = null; 

    public FlatFile() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public FileWriter getFw() {
        return fw;
    }

    public void setFw(FileWriter fw) {
        this.fw = fw;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }
    public List<Event> readFile(String filename,String separator) throws FileNotFoundException, IOException, IOException, IOException{
       List<Event> EventList = new ArrayList<>();
    
    try {
          this.setFile(new File(filename));
          this.setFr(new FileReader(this.getFile()));
          this.setBr(new BufferedReader(this.getFr()));
          String record;
          while((record = this.getBr().readLine())!=null){
             String fields[] = record.split(separator);
             Event event = new Event();
              event.setName(fields[0]);
              event.setCustomerDocument(fields[1]);
              event.setDecorOfTheEvent(fields[2]);
              event.setFoodEvent(fields[3]);
   
               }
          this.getBr().close();
          this.getFr().close();
      } catch (FileNotFoundException fnfex){
         
      }
       catch (IOException  ex) {
          Logger.getLogger(FlatFile.class.getName()).log(Level.SEVERE, null, ex);
      }
    return EventList;
}
    public void writeFile(List<Event> EventList,String filename, String separator) throws IOException{
    
        try {
          this.setFw(new FileWriter(filename)); //El true sirve para adicionar información 
          this.setPw(new PrintWriter(this.getFw()));
          
          for (Event event : EventList) //Con esto se recorre la lista
          {
            this.getPw().print(event.getName()+ separator);
            this.getPw().print(event.getCustomerDocument()+ separator);
            this.getPw().print(event.getDecorOfTheEvent()+ separator);
            this.getPw().print(event.getFoodEvent()+ separator);
          }
          this.getPw().close();
          this.getFw().close();
      } catch (IOException ex) {
          Logger.getLogger(FlatFile.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
    
    }




