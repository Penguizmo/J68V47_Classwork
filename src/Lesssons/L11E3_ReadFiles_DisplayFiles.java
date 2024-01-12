package Lesssons;

import java.io.*;

public class L11E3_ReadFiles_DisplayFiles {
    public static void main(String[] args) {
        String filename = "numbers.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int sum = 0;

            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
            }

            System.out.println("Sum of numbers in the file: " + sum);
        } catch (IOException e) {
            System.out.println("Error occurred reading from file: " + e.toString());
        }
    }
}