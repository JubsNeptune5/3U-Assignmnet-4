/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *Make a greeting for earthlings
 * @author laveh2107
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner to get input
        Scanner input = new Scanner(System.in);
        
        //Ask user to type in name
        System.out.println("Please enter the name you were given at birth");
        
        //set name givin as variable
        String name = input.nextLine();
        
        //greet guest with name and statement of gratitude
        System.out.println("Hello " + name + " how is your existance today");
        
        
    }
}
