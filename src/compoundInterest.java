import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double amount, principal, rate;
        int year;
        System.out.println("Enter the year for the Compound Interest:");
        year = scn.nextInt();
        System.out.println("Enter the principal for the Compound Interest:");
        principal = scn.nextDouble();
        System.out.println("Enter the rate for the Compound Interest:");
        rate = scn.nextDouble();
        for (int i = 1; i <= year; i++) {
            amount = principal * Math.pow(1 + rate, i);
            System.out.printf("The compound interest is %.2f for %d year.\n", amount, i);
        }

    }
}
