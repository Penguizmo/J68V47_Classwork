package Lesssons;

import java.util.Scanner;

public class L5E3_ForLoop_Integer_MathsQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Math Quiz Game!");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Question " + i + ":");

            int num1 = (int) (Math.random() * 10); // Generate a random number between 0 and 9
            int num2 = (int) (Math.random() * 10);

            System.out.print(num1 + " + " + num2 + " = ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = num1 + num2;

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("Quiz is over. Your score is: " + score + "/10");
    }
}