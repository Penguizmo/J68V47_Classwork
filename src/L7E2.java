import java.util.*;

public class L7E2 {

    public static int calculateSum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int getValidNumber(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        int number = input.nextInt();
        while (number < 0 || number > 10){
            System.out.print("ERROR. Invalid number.");
            System.out.print(message);
            number = input.nextInt();
        }
        return number;
    }

    public static void main(String[] args) {
        int num1 = getValidNumber("What is the first number? ");
        int num2 = getValidNumber("What is the second number? ");

        System.out.format("The sum of %d and %d is %d", num1, num2, calculateSum(num1, num2));
    }
}