/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author laveh2107
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {

            // Scanner to get input
            Scanner input = new Scanner(System.in);

            //Ask to enter dice
            System.out.println("Enter sum of dice:");
            int dice = input.nextInt();

            //Make sure the dice value is between 2 and 12
            if (dice >= 2) {
                if (dice <= 12) {
                int spot = 1 + dice;
                    System.out.println("You are now on square " +spot);
                }
            }else{
            System.out.println("You need to use legitimate dice");}
            if (dice == 0) {
                System.out.println("You choose to quit the game");
            } 
        }
    }
}
