import java.util.Scanner;
public class L5E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a base number: ");
        int base = scanner.nextInt();

        for (int count = 0; count <= 12; count++) {
            int result = base * count;
            System.out.format("%d x %d = %d%n", base, count, result);
        }
    }
}
