import java.util.*;

public class Lesson2ProgrammingExercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int num1 = input.nextInt();

        System.out.print("What is the second number? ");
        int num2 = input.nextInt();
        // Added "Total " after first ( so it shows at the start and what the numbers mean
        System.out.println("Total " + (num1 + num2));
        System.out.println("Total " + (num1 - num2));
        System.out.println("Total " + (num1 * num2));
        System.out.println("Total " + (num1 / num2));
        System.out.println("Total " + (num1 % num2));
        System.out.println("Total " + Math.pow (num1, num2));
    }
}