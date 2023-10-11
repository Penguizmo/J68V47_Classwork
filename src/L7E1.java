import java.util.Scanner;

public class L7E1 {
    public static void showMenu(){
        System.out.println("Menu:");
        System.out.println("1. Say 'hello'");
        System.out.println("2. Tell me the time");
        System.out.println("3. Tell me a joke");
        System.out.println("4. Quit");
        System.out.println("Enter an option (1 - 4): ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        //creat all Menu options using println
        do {
            showMenu();

            //create an input  using int options
            option = input.nextInt();
            System.out.println("Option Selected: " + option);

            if (option == 1) {
                System.out.println("Hello");
            } else if (option == 2) {
                // found a java date class on google to display actual time
                System.out.println("The current time is: " + new java.util.Date());
            } else if (option == 3) {
                System.out.println("Why don't scientists trust atoms?");
                System.out.println("Because they make up everything!");
            } else if (option != 4) {
                System.out.println("Invalid option");
            }

        } while (option != 4);

        System.out.println("Goodbye!");
    }
}