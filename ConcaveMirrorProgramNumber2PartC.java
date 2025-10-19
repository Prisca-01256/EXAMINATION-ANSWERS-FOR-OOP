/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.concavemirrorprogramnumber2partc;

/**
 *
 * @author VU-STUDENT
 */
 import java.util.Scanner;
public class ConcaveMirrorProgramNumber2PartC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter object distance (u in cm): ");
        double u = sc.nextDouble();
        // For concave mirrors, u is always negative
        u = -Math.abs(u);  
        System.out.print("Enter image distance (v in cm): ");
        double v = sc.nextDouble();

   
        double f = 1 / ((1 / v) + (1 / u));

     
        System.out.println("Focal length (f) is: " + f + " cm");

        
        if (f >= 21.0 && f <= 25.0) {
            System.out.println("The mirror is acceptable.");
        } else {
            System.out.println("The mirror is not acceptable.");
        }
    }
}

    

