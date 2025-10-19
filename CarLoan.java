/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.loanquestionfivepartb;

/**
 *
 * @author VU-STUDENT
 */
public class CarLoan{
    // Variable to store car lien
    private String car_lien;

    // No-argument constructor that initializes the variables
    public CarLoan() {
        super();  // Calls the parent class (Loan) constructor
        this.car_lien = "";
    }

    // Method to assign value to the lien
    public void setCarLien(String lien) {
        this.car_lien = lien;
    }

    // Method to return the value of the lien
    public String getCarLien() {
        return car_lien;
    }

    // Implementing the abstract method to indicate the loan type
    public void loanType() {
        this.loan_type = "Car Loan";
        System.out.println("Loan Type: " + this.loan_type);
    }
}


