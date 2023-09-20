import java.util.*;
public class L4E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name? ");
        String name = input.nextLine();

        System.out.print("Enter your surname? ");
        String surname = input.nextLine();

        System.out.print("Enter the total value of your order: ");
        double value = scanner.nextDouble();

        System.out.print("Enter the total amount you wish to play as a deposit: ");
        double deposit = scanner2.nextDouble();

        //Add Receipt display code bellow this line

        System.out.println("== RECEIPT == ");
        System.out.println(name.substring(0, 1)  + surname);
        System.out.format("Order Total £%.2f %n", value);
        System.out.format("Deposit Paid £%.2f %n", deposit);
        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.format("Remainder £%,2f %n", (value - deposit));
        System.out.format("Have a nice day %n");

    }
}
