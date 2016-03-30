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
public class StartSotfware {
    private int evetMonth; /**attribute that displays the event month*/
    private char cashReservesMonth; /**attribute that shows the money supply for the month*/
    private char creditsRequested; /**attribute showing the appropriations requested*/
    private char incomeExpensesMonth; /**attribute that shows the income and expenditure of the month*/
    
    /**
     * Default constructor
     * 
     */
    
    public StartSotfware (){
    this.evetMonth=0;
    this.cashReservesMonth=0;
    this.creditsRequested=0;
    this.incomeExpensesMonth=0;
}
    /**
     * Parameterized constructor
     * @param eventMonth attribute that displays the event month
     * @param cashReservesMonth attribute that shows the money supply for the month
     * @param creditsRequested attribute showing the appropriations requested
     * @param incomeExpensesMonth attribute that shows the income and expenditure of the month
     */
    public  StartSotfware ( int eventMonth,char cashReservesMonth, char creditsRequested, char incomeExpensesMonth ){
    
    this.evetMonth = evetMonth;
    this.cashReservesMonth = cashReservesMonth;
    this.creditsRequested = creditsRequested;
    this.incomeExpensesMonth = incomeExpensesMonth;
        
    }
    
/**
 * gets the EvetMonth
 * @return EvetMonth
 */

    public int getEvetMonth() {
        return evetMonth;
    }
/**
 * change the evetMonth 
 * @param evetMonth 
 */
    public void setEvetMonth(int evetMonth) {
        this.evetMonth = evetMonth;
    }
/**
 gets the CashReservesMonth
 * @return CashReservesMonth
 */
    public char getCashReservesMonth() {
        return cashReservesMonth;
    }
/**
 * change the cashReservesMonth 
 * @param cashReservesMonth 
 */
    public void setCashReservesMonth(char cashReservesMonth) {
        this.cashReservesMonth = cashReservesMonth;
    }
/**
 * gets the CreditsRequested
 * @return CreditsRequested
 */
    public char getCreditsRequested() {
        return creditsRequested;
    }
/**
 * change the creditsRequested 
 * @param creditsRequested 
 */
    public void setCreditsRequested(char creditsRequested) {
        this.creditsRequested = creditsRequested;
    }
/**
 * gets the IncomeExpensesMonth
 * @return IncomeExpensesMonth
 */
    public char getIncomeExpensesMonth() {
        return incomeExpensesMonth;
    }
/**
 * change the incomeExpensesMonth 
 * @param incomeExpensesMonth 
 */
    public void setIncomeExpensesMonth(char incomeExpensesMonth) {
        this.incomeExpensesMonth = incomeExpensesMonth;
    }
}