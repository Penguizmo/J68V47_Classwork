import java.util.Scanner;
public class Exercise_2_L3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of Spain? ");
        String Spain = input.nextLine();
        System.out.println("Madrid ".toLowerCase());
        System.out.println(Spain.contains("Madrid"));

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