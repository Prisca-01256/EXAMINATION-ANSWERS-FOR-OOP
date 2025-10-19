/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.question.three.partc;

/**
 *
 * @author VU-STUDENT
 */
import java.util.Scanner;
public class QuestionThreePartC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's score (out of 100): ");
        int score = scanner.nextInt();

        String grade = " ";
        String remark = " ";

        if (score >= 80 && score <= 100) {
            grade = "1";
            remark = "Distinction";
        } else if (score >= 75 && score <= 79) {
            grade = "2";
            remark = "Distinction";
        } else if (score >= 66 && score <= 74) {
            grade = "3";
            remark = "Credit";
        } else if (score >= 60 && score <= 65) {
            grade = "4";
            remark = "Credit";
        } else if (score >= 50 && score <= 59) {
            grade = "5";
            remark = "Credit";
        } else if (score >= 45 && score <= 49) {
            grade = "6";
            remark = "Credit";
        } else if (score >= 35 && score <= 44) {
            grade = "7";
            remark = "Pass";
        } else if (score >= 30 && score <= 34) {
            grade = "8";
            remark = "Pass";
        } else if (score >= 0 && score <= 29) {
            grade = "9";
            remark = "Fail";
        } else {
            System.out.println("Invalid score entered. Please enter a score between 0 and 100.");
            return;
        }
        System.out.println("Score is: " + score);
        System.out.println("Grade is: " + grade);
        System.out.println("Remark is: " + remark);

        scanner.close();
    }
}

    

