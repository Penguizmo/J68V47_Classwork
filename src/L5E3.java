import java.util.Scanner;

public class L5E3 {
    public static void main(String[] args) {
        // Create a question Scanner
        // Create an answer Scanner
        Scanner question = new Scanner(System.in);
        Scanner answer = new Scanner(System.in);

        // Create string variables for 10 questions, using L3E2 as an example
        // Then set if else questions

        System.out.println("What is 1 + 1? ");
        String question1 = question.nextLine();

        System.out.println("What is 1 + 2? ");
        String question2 = question.nextLine();

        System.out.println("What is 1 + 3? ");
        String question3 = question.nextLine();

        System.out.println("What is 1 + 4? ");
        String question4 = question.nextLine();

        System.out.println("What is 1 + 5? ");
        String question5 = question.nextLine();

        System.out.println("What is 1 + 6? ");
        String question6 = question.nextLine();

        System.out.println("What is 1 + 7? ");
        String question7 = question.nextLine()();

        System.out.println("What is 1 + 8? ");
        String question8 = question.nextLine();

        System.out.println("What is 1 + 9? ");
        String question9 = question.nextLine();

        System.out.println("What is 1 + 10? ");
        String question10 = question.nextLine();



        // Start a score int as 0
        int score = 0;



        // Loop through the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i+1) + ": " + questions[i]);
            System.out.print("Enter your answer: ");

            // Read user input
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        // Display final score
        System.out.println("Quiz completed. Your score is: " + score + "/" + questions.length);
    }
}