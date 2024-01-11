package Lesssons;

import java.util.Scanner;

public class L3E2_And_L4E2_StringFunction_Quiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of Spain? ");
        String answer1 = input.nextLine().toLowerCase();

        if (answer1.equals("madrid")) {
            System.out.println("Correct! The answer is Madrid.");
            //I used the }else{ command from slide 15 to set the difference from if command
        } else {
            System.out.println("Sorry, the correct answer is Madrid.");
        }

        System.out.println("What is the capital of England? ");
        String answer2 = input.nextLine().toLowerCase();

        if (answer2.equals("london")) {
            System.out.println("Correct! The answer is London.");
        } else {
            System.out.println("Sorry, the correct answer is London.");
        }

        System.out.println("What is the capital of France? ");
        String answer3 = input.nextLine().toLowerCase();

        if (answer3.equals("paris")) {
            System.out.println("Correct! The answer is Paris.");
        } else {
            System.out.println("Sorry, the correct answer is Paris.");
        }
    }
}