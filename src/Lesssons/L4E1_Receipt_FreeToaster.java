package Lesssons;

import java.util.*;
public class L4E1_Receipt_FreeToaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name? ");
        String firstName = input.nextLine();

        System.out.print("Enter your surname? ");
        String lastName = input.nextLine();

        System.out.print("Enter the total value of your order: £"); // Added £
        float value = scanner.nextFloat();

        System.out.print("Enter the total amount you wish to pay as a deposit: £"); // Added £
        float deposit = scanner2.nextFloat();

        //Add Receipt display code bellow this line

        System.out.println("== RECEIPT == ");
        System.out.println(firstName.substring(0, 1)  +  lastName);
        System.out.format("Order Total £%.2f %n", value);
        System.out.format("Deposit Paid £%.2f %n", deposit);
        System.out.format("Remainder £%.2f %n", (value - deposit)); //Fixed an issue where I had a, instead of .

        if (deposit > 100) {
            System.out.println("Congratulation, you win a free toaster!"); //Changed the text and realigned it to the 2nd bottom line
        }

        System.out.format("Have a nice day ");

    }
}
