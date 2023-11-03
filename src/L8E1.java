import java.util.*;

public class L8E1 {

    public static void main(String[] args) {

        String[] names = {"Christopher", "Susan", "Bill", "Satya", "Darren"};
        System.out.println("The first Students name is " + names[0]);
        System.out.println("The last Students name is " + names[names.length-1]);
        System.out.printf("The number of items in the array is: %d", names.length);
    }
}