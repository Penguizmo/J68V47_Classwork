import java.util.Scanner;
public class Exercise_2_L3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of Spain? ");
        String Answer1 = input.nextLine();
        System.out.println(Answer1.toLowerCase().contains("madrid" ));

        // I changed lines 8 and 9 to match your code
        // I left my original code in lines 13 - 21 so that you can see my work.
        // Both gave the same results

        System.out.println("What is the capital of England? ");
        String England = input.nextLine();
        System.out.println(England.toLowerCase());
        System.out.println(England.contains("London"));

        System.out.println("What is the capital of France? ");
        String France = input.nextLine();
        System.out.println(France.toLowerCase());
        System.out.println(France.contains("Paris"));

    }
}