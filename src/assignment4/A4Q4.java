/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 * Prom ticket calculator to see how many tickets it will take to break even
 *
 * @author laveh2107
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get user input
        Scanner input = new Scanner(System.in);

        //Ask for food cost
        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();

        //Ask for DJ cost
        System.out.println("How much will the DJ cost?");
        double dj = input.nextDouble();

        //Ask for hall rent
        System.out.println("How much does it cost to rent the hall?");
        double hall = input.nextDouble();

        //Ask for decoration cost
        System.out.println("How much does decorations cost?");
        double decor = input.nextDouble();

        //Ask for staff cost
        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();

        //Ask for misc cost
        System.out.println("How much for miscellaneous costs?");
        double misc = input.nextDouble();

        //Add up prices to find cost
        double cost = food + dj + hall + decor + staff + misc;

        //find if you will break even when tcikets cost $35
        double tickets = cost / 35;
        
        tickets = Math.ceil(tickets);

        
        //State how many tickets they would need to sell to break even
        System.out.println("The total cost is $" + cost + ". You will need to sell " + tickets + " tickets to break even.");
    }
}
