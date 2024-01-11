package Lesssons;

import java.util.Arrays;
public class L8E3_Arrays_SizeManagment {
    public static void main(String[] args) {
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };

        // Print out each direction
        int step = 1;
        for (String direction : directions) {
            System.out.format("%d. %s %n", step, direction);
            step++;
        }

        // Add the item “After turning onto Elm Street, walk past the grocery store on your right.”
        // To the appropriate location in the directions array using a function call.
        directions = addToStringArray(directions, "After turning onto Elm Street, walk past the grocery store on your right.");

        // Print out the new directions
        System.out.println("---");
        step = 1;
        for (String direction : directions) {
            System.out.format("%d. %s %n", step, direction);
            step++;
        }

        // Remove the last item from the altered directions array using a function call.
        directions = removeLastElement(directions);

        // Print out the updated directions
        System.out.println("---");
        step = 1;
        for (String direction : directions) {
            System.out.format("%d. %s %n", step, direction);
            step++;
        }
    }

    public static String[] addToStringArray(String[] oldArray, String newString) {
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length] = newString;
        return newArray;
    }

    public static String[] removeLastElement(String[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length - 1);
    }
}