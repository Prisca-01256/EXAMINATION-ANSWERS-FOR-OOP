/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.loanquestionfivepartb;

/**
 *
 * @author VU-STUDENT
 */
public class LoanQuestionFivePartB {

    public static void main(String[] args) {
        abstract class Loan {
    // Data members
    protected int loan_id;
    protected String loan_type;
    protected double amount;
    protected String cust_name;

    // Default no-argument constructor to initialize loan amount to 0
    public Loan() {
        this.loan_id = 0;
        this.amount = 0.0;
        this.loan_type = "";
        this.cust_name = "";
    }

    // Set methods for loan_id and cust_name
    public void setLoanId(int loan_id) {
        this.loan_id = loan_id;
    }

    public void setCustName(String cust_name) {
        this.cust_name = cust_name;
    }

    // Get methods for loan_id and cust_name
    public int getLoanId() {
        return loan_id;
    }

    public String getCustName() {
        return cust_name;
    }

    // Method to set the value of loan amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Method to return the value of loan amount
    public double getAmount() {
        return amount;
    }

    // Abstract method to indicate the loan type
    public abstract void loanType();
}
    }
}

    

