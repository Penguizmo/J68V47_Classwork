package Lesssons;

import java.util.Scanner;
public class L3E1_StringFunction_NameAndDOB {
    public static void main(String[] args) {

        // Set the first 3 lines to gather the information

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name? ");
        String name = input.nextLine();

        System.out.print("Enter your surname? ");
        String surname = input.nextLine();

        System.out.print("Enter your year of birth? ");
        String dob = input.nextLine();

        // Use the next 2 section of code to generate a DOB and Username

        System.out.println("Username: " + name.substring(0, 1) + surname.substring(0, 3));

        System.out.println("Password: " +surname.substring(0, 1) + name.substring(0, 3).toUpperCase() + dob);
    }
}