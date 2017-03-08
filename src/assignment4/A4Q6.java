/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 * Speeding radar fine calculator
 * @author laveh2107
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner to get input
        Scanner input = new Scanner(System.in);

        //ask the speed limit
        System.out.println("Enter the speed limit:");
        int limit = input.nextInt();

        //ask for current speed
        System.out.println("Enter the recorded speed of the car");
        int speed = input.nextInt();

        //FInd if they are in the limit 
        if (speed - limit <= 1) {
            //if in speed limit say this
            System.out.println("Congradulations you are within the speed limit");
        } 
        
        else {
            //if they are going up to 20 km more 
            if (speed - limit <= 20) {
                System.out.println("You are speeding and your fine is $100.");
            } 
           
            else {
                //if they are going up to 30 km more
                if (speed - limit <= 30) {
                    System.out.println("You are speeding and your fine is $270.");
                } 
                
                else {
                    //if they are going more than 30 km 
                    if (speed - limit >= 30) {
                        System.out.println("You are speeding and your fine is $500.");
                    }
                }
            }
        }
    }
}
