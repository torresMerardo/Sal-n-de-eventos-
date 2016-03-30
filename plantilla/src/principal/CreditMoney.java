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
public class CreditMoney {
    
    private char bankCredit; /**attribute that shows the bank's */
    private int creditUnit; /**attribute that shows credit unit*/
    private char creditMoney; /* attribute showing money credit*/
    private int rateDebt; /*attribute that shows the type of debt*/
    
    
     /**
     * Default constructor
     * 
     */
    private CreditMoney(){
        this.bankCredit=0;
        this.creditUnit=0;
        this.creditMoney=0;
        this.rateDebt=0;
    }
    /**
     * Parameterized constructor
     * @param bankCredit    attribute that shows the bank's 
     * @param creditUnit    attribute that shows credit unit
     * @param creditmoney   attribute showing money credit
     * @param rateDebt      attribute that shows the type of debt
     * 
     */
    public CreditMoney (char bankCredit, int creditUnit, char creditMoney, int rateDebt){
        this.bankCredit = bankCredit;
        this.creditUnit = creditUnit;
        this.creditMoney = creditMoney;
        this.rateDebt = rateDebt;
        
        
    }
/**
 * gets the BankCredit
 * @return BankCredit
 */
    public char getBankCredit() {
        return bankCredit;
    }
/**
 * change the bankCredit 
 * @param bankCredit 
 */
    public void setBankCredit(char bankCredit) {
        this.bankCredit = bankCredit;
    }
/***
 * gets the CreditUnit
 * @return CreditUnit
 */
    public int getCreditUnit() {
        return creditUnit;
    }
/**
 * change the  creditUnit 
 * @param creditUnit 
 */
    public void setCreditUnit(int creditUnit) {
        this.creditUnit = creditUnit;
    }
/**
 * gets the CreditMoney
 * @return CreditMoney
 */
    public char getCreditMoney() {
        return creditMoney;
    }
/***
 * change the creditMoney
 * @param creditMoney 
 */
    public void setCreditMoney(char creditMoney) {
        this.creditMoney = creditMoney;
    }
/***
 * gets the RateDebt
 * @return RateDebt
 */
    public int getRateDebt() {
        return rateDebt;
    }
/**
 * change the rateDebt
 * @param rateDebt 
 */
    public void setRateDebt(int rateDebt) {
        this.rateDebt = rateDebt;
    }
}
