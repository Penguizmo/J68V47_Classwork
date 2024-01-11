package Lesssons;

import java.util.Scanner;
public class L4E3_IfandElseStatement_ShippingCharges {
    public static void main(String[] args) {
        Scanner amount = new Scanner(System.in);

    System.out.print("Enter your total purchase amount: £");
    double deposit = amount.nextInt();
        if (deposit >= 50) {
            System.out.println("Free Shipping!");
        } else {
            System.out.println("Your final total is : £" + (deposit + 10));
        }
    }
}
