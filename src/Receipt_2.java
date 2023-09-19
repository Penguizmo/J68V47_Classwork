import java.util.Scanner;
public class Receipt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Item 1: ");
        String name1 = scanner.nextLine();

        System.out.print("Price of Item 1: ");
        float price1 = scanner.nextFloat();

        System.out.print("Item 2: ");
        String name2 = scanner2.nextLine();

        System.out.print("Price of Item 2: ");
        float price2 = scanner2.nextFloat();

        System.out.print("Item 3: ");
        String name3 = scanner3.nextLine();

        System.out.print("Price of Item 3: ");
        float price3 = scanner3.nextFloat();

        float subtotal = price1 + price2 + price3;

        System.out.println("Snugology");
        System.out.format("%s...£%.2f %n", name1, price1);
        System.out.format("%s........£%.2f %n", name2, price2);
        System.out.format("%s..£%.2f %n", name3, price3);
        System.out.format("Subtotal...£%.2f %n", subtotal);

    }
}
