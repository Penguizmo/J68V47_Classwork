package Lesssons;

import java.util.Scanner;
public class Exercise_3_L3E3 {

    /**The cost of a loan
     * The interest rate
     * The number of years for the loan
     * M = L( j / (1 - (1+j)^-n ) )
     * M = monthly payment
     * L = Loan amount
     * j = interest rate in months(for interest rate of 5%APR,
     * j = 0.05/12)n = number of years * 12
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Interest Rate (APR%): ");
        double interestRate = scanner.nextDouble() / 100;// converted the APR to decimal by dividing the input by 100

        System.out.print("Number of years: ");
        int numYears = scanner.nextInt();

        int numMonths = numYears * 12;
        double monthlyInterestRate = interestRate / 12;

        double monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numMonths)));

        System.out.format("Monthly Payment for this loan = £%.2f\n", monthlyPayment);
    }
}