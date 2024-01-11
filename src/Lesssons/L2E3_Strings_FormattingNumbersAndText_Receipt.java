package Lesssons;

import java.util.Scanner;
public class L2E3_Strings_FormattingNumbersAndText_Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Snugology");
        /**
         * Mattress = £299.99
         * Bed Frame = £199.99
         * Headboard = £69.99
         * Total = £569.97
         * Use double or float variable for converting
         * Set the coversions first, before println
         */

        double mattressPrice = 299.99;
        double bedFramePrice = 199.99;
        double headboardPrice = 69.99;
        /**
         * Double worked
         * Int never???
         */

        System.out.println("Mattress....£" + mattressPrice);
        System.out.println("Bed Frame...£" + bedFramePrice);
        System.out.println("Headboard...£" + headboardPrice);

        //

        double subtotal = mattressPrice + bedFramePrice + headboardPrice;
        System.out.println("Subtotal:...£" + subtotal);

    }
}