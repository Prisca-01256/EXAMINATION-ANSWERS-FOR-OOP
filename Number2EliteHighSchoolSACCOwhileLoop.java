/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.number2elitehighschoolsaccowhileloop;

import java.util.Scanner;

/**
 *
 * @author VU-STUDENT
 */

public class Number2EliteHighSchoolSACCOwhileLoop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of teachers: ");
        int numTeachers = scanner.nextInt();

        int i = 1;
        // While loop to calculate the investment for each teacher
        while (i <= numTeachers) {
            System.out.print("Enter the principal amount for teacher " + i + ": ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the time in years for teacher " + i + ": ");
            int time = scanner.nextInt();

            // Interest rate is 5%
            double interestRate = 0.05;

            double amount = principal * (1 + interestRate * time);

         
            System.out.println("Investment value for teacher " + i + " after " + time + " years: " + amount);

          
            i++;
        }

        scanner.close();
    }
}

