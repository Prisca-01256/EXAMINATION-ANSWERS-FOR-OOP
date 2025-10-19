/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.question.three.partc;

import java.util.Scanner;

/**
 *
 * @author VU-STUDENT
 */
public class ModifiedProgramForFiveStudentsQuestion3PartC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing grade counters
        int[] gradeCounts = new int[9]; // Array to store counts for grades 1 to 9

        // Processing scores for 5 students
        int studentCount = 1;
        while (studentCount <= 5) {
            System.out.print("Enter score for student " + studentCount + " (out of 100): ");
            int score = scanner.nextInt();

            //For grade and mark.
            String grade = " ";
            String remark = " ";

            if (score >= 80 && score <= 100) {
                grade = "1";
                remark = "Distinction";
                gradeCounts[0]++; 
            } else if (score >= 75 && score <= 79) {
                grade = "2";
                remark = "Distinction";
                gradeCounts[1]++; 
            } else if (score >= 66 && score <= 74) {
                grade = "3";
                remark = "Credit";
                gradeCounts[2]++; 
            } else if (score >= 60 && score <= 65) {
                grade = "4";
                remark = "Credit";
                gradeCounts[3]++; 
            } else if (score >= 50 && score <= 59) {
                grade = "5";
                remark = "Credit";
                gradeCounts[4]++; 
            } else if (score >= 45 && score <= 49) {
                grade = "6";
                remark = "Credit";
                gradeCounts[5]++;
            } else if (score >= 35 && score <= 44) {
                grade = "7";
                remark = "Pass";
                gradeCounts[6]++;
            } else if (score >= 30 && score <= 34) {
                grade = "8";
                remark = "Pass";
                gradeCounts[7]++;
            } else if (score >= 0 && score <= 29) {
                grade = "9";
                remark = "Fail";
                gradeCounts[8]++; 
            } else {
                System.out.println("Invalid score entered. Please enter a score between 0 and 100.");
                continue; 
            }

            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);

            studentCount++;
        }

        System.out.println("\nGrade Summary:");
        for (int i = 0; i < gradeCounts.length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + gradeCounts[i] + " student(s)");
        }
        scanner.close();
    }
}



    

