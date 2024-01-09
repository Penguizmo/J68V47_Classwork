package Lesssons;

import java.util.Scanner;

public class L8E2 {

    public static void main(String[] args) {

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length; // Use double for more accurate average

        System.out.println("Exam Scores:");
        for (int score : scores) {
            System.out.println(score);
        }

        System.out.println("The Average Score is: " + average);
    }
}