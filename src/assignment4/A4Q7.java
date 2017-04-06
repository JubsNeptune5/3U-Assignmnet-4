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

        for (int x = 1; x < 100; x = x + 1) {

            // Scanner to get input
            Scanner input = new Scanner(System.in);

            //Ask to enter dice
            System.out.println("Enter sum of dice:");
            int dice = input.nextInt();

            if (dice == 0) {
                System.out.println("You choose to quit the game");
                break;
            }
            //Make sure the dice value is between 2 and 12
            if (dice >= 2) {
                if (dice <= 12) {

                    int spot = 1 + dice;

                    //if marker lands on a ladder
                    if (spot == 9) {
                        spot = 34;
                    }
                    if (spot == 40) {
                        spot = 64;
                    }
                    if (spot == 67) {
                        spot = 86;
                    }

                    //if land on snakes 
                    if (spot == 99) {
                        spot = 77;
                    }
                    if (spot == 90) {
                        spot = 48;
                    }
                    if (spot == 54) {
                        spot = 19;
                    }
                    if (spot < 100) {
                        System.out.println("You are now on square " + spot);
                    }
                }
            }
        }
    }
}
