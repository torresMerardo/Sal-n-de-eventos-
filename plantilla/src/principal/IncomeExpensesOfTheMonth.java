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
public class IncomeExpensesOfTheMonth {
    
    private char incodeMonth; /** attribute month income */
    private char expensesMonth; /** attribute the expenditure of the month */
    private char monthEarnings; /** attribute the gains of the month*/
    
    /**
     * Default constructor
     * 
     */
        
    private IncomeExpensesOfTheMonth() {
        this.incodeMonth=0;
        this.expensesMonth=0;
        this.monthEarnings=0;
    }
    /**
     * Parameterized constructor
     * @param incodeMonth attribute month income
     * @param expensesMonth attribute the expenditure of the month
     * @param monthEarning  attribute the gains of the month

     */
        
        private IncomeExpensesOfTheMonth (char incodeMonth, char expensesMonth, char monthEarning){
            
            this.incodeMonth = incodeMonth;
            this.expensesMonth = expensesMonth;
            this.monthEarnings = monthEarnings;
            
        }
/**
 * gets as the IncodeMonth
 * @return IncodeMonth
 */

    public char getIncodeMonth() {
        return incodeMonth;
    }
/**
 * change the incodeMonth 
 * @param incodeMonth 
 */
    public void setIncodeMonth(char incodeMonth) {
        this.incodeMonth = incodeMonth;
    }
/**
 * gets as the ExpensesMonth
 * @return ExpensesMonth
 */
    public char getExpensesMonth() {
        return expensesMonth;
    }
/**
 * change the expensesMonth 
 * @param expensesMonth 
 */
    public void setExpensesMonth(char expensesMonth) {
        this.expensesMonth = expensesMonth;
    }
/**
 * gets as the MonthEarnings
 * @return MonthEarnings
 */
    public char getMonthEarnings() {
        return monthEarnings;
    }
/**
 * change the monthEarnings 
 * @param monthEarnings 
 */
    public void setMonthEarnings(char monthEarnings) {
        this.monthEarnings = monthEarnings;
    } 
}
