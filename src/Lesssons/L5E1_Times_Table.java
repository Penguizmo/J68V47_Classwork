package Lesssons;

import java.util.Scanner;

public class L5E1_Times_Table {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int base = input.nextInt();
        for(int count=1; count<=12; count++)
        {
            System.out.format("%d x %d %n", base, count, (base*count));
        }
    }
}