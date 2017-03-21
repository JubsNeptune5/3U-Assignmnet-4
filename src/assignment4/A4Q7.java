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

        // Scanner to get input
        Scanner input = new Scanner(System.in);

        // initaluiza a start position
        int p = 1;

        //Ask to enter dice
        System.out.println("Welcome to Snakes and Latters!!!!");
        while (p < 100) {
            //Tell person to enter dice
            System.out.println("Enter sum of dice:");
            int dice = input.nextInt();


            //Make sure the dice value is between 2 and 12
            if (dice >= 2) {
                if (dice <= 12) {

                    p = p + dice;

                    //if marker lands on a ladder
                    if (p == 9) {
                        p = 34;
                    }
                    if (p == 40) {
                        p = 64;
                    }
                    if (p == 67) {
                        p = 86;
                    }

                    //if land on snakes 
                    if (p == 99) {
                        p = 77;
                    }
                    if (p == 90) {
                        p = 48;
                    }
                    if (p == 54) {
                        p = 19;
                    }
                }
            }
            //Quit the game
            if (dice == 0) {
                System.out.println("You choose to quit the game:{");
                break;
            }
            //if the player doesn't finish the game
            if (p < 100) {
                System.out.println("You are now on square " + p);
            }
            //Iff score is above or exactly 100, say they won
            if (p >= 100) {
                System.out.println("Congratulations, you won the game!!!");
            }
        }

    }
}
