/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 * Covert inches to metres
 *
 * @author laveh2107
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a space to put converion in
        Scanner input = new Scanner(System.in);

        //Ask to enter value in inches
        System.out.println("Please enter the value of the measurment in inches");

        //make thier value a variable
        int inches = input.nextInt();

        //Convert inches to cm
        double cm = inches * 2.54;

        //let them know that the value in cm
        if (cm >= 0) {
            System.out.println("Your measurement " + inches + " in inches is " + cm + " centimeters");
        } else {
            //If a negative number yell at them
            System.out.println("You cant have a negative measurement silly");
        }



    }
}
