package Lesssons;

import java.io.*;

public class L11E1_WritingFiles {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(reader.readLine());

            FileWriter fileWriter = new FileWriter("times_table.txt");

            for (int i = 1; i <= 12; i++) {
                int result = i * number;
                String equation = i + " x " + number + " = " + result + "\n";
                fileWriter.write(equation);
            }

            fileWriter.close();
            System.out.println("Times table generated and saved to times_table.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}