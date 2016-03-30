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
public class CashReserves {
    private char reseveMoney;
    private int reserveUnit;
    
    /**
     * Default constructor
     * */
    
    public CashReserves (){
        this.reseveMoney=0;
        this.reserveUnit=0;
    }
        
        /**
         * Parameterized constructor
         * @param reseveMoney attribute of money in reserve
         * @param reserveUnit attribute of the unit in reserve
         */
    
        public CashReserves (char reserveMoney,int reserveUnit){
            this.reseveMoney = reseveMoney;
            this.reserveUnit = reserveUnit;
            
        }
/**
 * gets the ReseveMoney
 * @return ReseveMoney
 */

    public char getReseveMoney() {
        return reseveMoney;
    }
/**
 * change the reseveMoney
 * @param reseveMoney 
 */
    public void setReseveMoney(char reseveMoney) {
        this.reseveMoney = reseveMoney;
    }
/**
 * gets the ReserveUnit
 * @return ReserveUnit
 */
    public int getReserveUnit() {
        return reserveUnit;
    }
/**
 * change the reserveUnit 
 * @param reserveUnit 
 */
    public void setReserveUnit(int reserveUnit) {
        this.reserveUnit = reserveUnit;
    }
    
}
