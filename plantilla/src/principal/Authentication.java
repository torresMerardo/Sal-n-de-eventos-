/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *class CashReserves
 * Andres Torres
 * @author andres
 */
public class Authentication {
    private String user; /**Attribute to enter the user*/
    private String password; /**Attribute to enter the user's password*/
    
   
    /**
     * Default constructor
     * 
     * */
    public Authentication (){
        this.password="";
        this.user ="0";
    
        /**
         * parameterized constructor
         * @param user    Attribute to enter the user
         * @param password    Attribute to enter the user's password
         */
    }
         public Authentication(String user,String password){
        this.user = user;
        this.password = password;
    }
/**
 * gets the user
 * @return user
 */
    public String getUser() {
        return user;
    }
/**
 * change the user
 * @param user 
 */
    public void setUser(String user) {
        this.user = user;
    }
/**
 * gets the password
 * @return password
 */
    public String getPassword() {
        return password;
    }
/**
 * change the passwrd
 * @param password 
 */
 
    public void setPassword(String password) {
        this.password = password;
    }
        
       
}

