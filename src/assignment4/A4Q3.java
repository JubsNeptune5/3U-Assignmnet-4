/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *List four numbers in a line
 * @author laveh2107
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner to get input
        Scanner input = new Scanner(System.in);
        
        //ask user to type in numbers on different line
        System.out.println("Please enter your four numbers and hit enter/return after you typed one in");    
        
        //Give each line with new variable
        double line1 = input.nextDouble();
        double line2 = input.nextDouble();
        double line3 = input.nextDouble();
        double line4 = input.nextDouble();
        
        //List the integers
        System.out.println("Your numbers are: " + line1 + ", " + line2 + ", " + line3 + ", " + line4 );
    }
}
