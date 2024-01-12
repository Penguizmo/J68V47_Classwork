package Lesssons;

import java.io.*;
public class L11E2_ReadingFiles {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("times_table.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null);

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
