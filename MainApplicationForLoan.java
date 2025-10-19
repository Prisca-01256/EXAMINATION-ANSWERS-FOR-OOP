/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.loanquestionfivepartb;

/**
 *
 * @author VU-STUDENT
 */
public class MainApplicationForLoan {
    public class MainClass {
    public static void main(String[] args) {
        // Create a CarLoan object
        CarLoan carLoan1 = new CarLoan();

        // Assign values to the CarLoan object
        carLoan1.setLoanId(101);
        carLoan1.setCustName("Prisca Watangwa");
        carLoan1.setAmount(50000.0);
        carLoan1.setCarLien("Car lien placed until loan is paid");

        // Displaying loan details
        System.out.println("Loan ID: " + carLoan1.getLoanId());
        System.out.println("Customer Name: " + carLoan1.getCustName());
        System.out.println("Loan Amount: " + carLoan1.getAmount());
        carLoan1.loanType();  // Outputs: Loan Type: Car Loan
        System.out.println("Car Lien: " + carLoan1.getCarLien());
    }
}

}
