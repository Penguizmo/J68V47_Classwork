package Lesssons;

public class L8E1_Arrays_Strings {

    public static void main(String[] args) {

        String[] names = {"Christopher", "Susan", "Bill", "Satya", "Darren"};
        System.out.println("The first Students name is " + names[0]);
        System.out.println("The last Students name is " + names[names.length-1]);
        System.out.printf("The number of items in the array is: %d", names.length);
    }
}