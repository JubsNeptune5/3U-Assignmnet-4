/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *Student average finder
 * @author laveh2107
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner to get input
        Scanner input = new Scanner(System.in);
        
        // Ask to enter name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        //space
        System.out.println("");
        
        //Ask info about fisrt test
        System.out.println("What was the first test out of?");
        int test1 = input.nextInt();
        System.out.println("What mark did you get?:");
        double mark1 = input.nextDouble();
        
        //space
        System.out.println("");
        
        //Ask info about second test
        System.out.println("What was the second test out of?");
        int test2 = input.nextInt();
        System.out.println("What mark did you get?:");
        double mark2 = input.nextDouble();
        
        //space
        System.out.println("");
        
        //Ask info about third test
        System.out.println("What was the third test out of?");
        int test3 = input.nextInt();
        System.out.println("What mark did you get?:");
        double mark3 = input.nextDouble();
        
        //space
        System.out.println("");
        
        //Ask info about fourth test
        System.out.println("What was the fourth test out of?");
        int test4 = input.nextInt();
        System.out.println("What mark did you get?:");
        double mark4 = input.nextDouble();
        
        //space
        System.out.println("");
        
        //Ask info about fifth test
        System.out.println("What was the fifth test out of?");
        int test5 = input.nextInt();
        System.out.println("What mark did you get?:");
        double mark5 = input.nextDouble();
        
        //space
        System.out.println("");
        
        //find scores for tests
        double score1 = mark1/test1;
        double score2 = mark2/test2;
        double score3 = mark3/test3;
        double score4 = mark4/test4;
        double score5 = mark5/test5;
        
        //find the average score
        double scoreA = (score1*100 + score2*100 + score3*100 + score4*100 + score5*100)/5;
        
        //State score of test
        System.out.println("Test score for " + name);
        System.out.println("Test 1: " + score1 + "%");
        System.out.println("Test 2: " + score2 + "%");
        System.out.println("Test 3: " + score3 + "%");
        System.out.println("Test 4: " + score4 + "%");
        System.out.println("Test 5: " + score5 + "%");
        System.out.println("");
        System.out.println("Average: " + scoreA + "%");
       
        
        
    }
}
