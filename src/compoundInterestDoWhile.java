import java.util.Scanner;

public class compoundInterestDoWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double amount, principal, rate;
        int year, i = 1;
        System.out.println("Enter the year for the Compound Interest:");
        year = scn.nextInt();
        System.out.println("Enter the principal for the Compound Interest:");
        principal = scn.nextDouble();
        System.out.println("Enter the rate for the Compound Interest:");
        rate = scn.nextDouble();
        do {
            amount = principal * Math.pow(1 + rate, i);
            System.out.printf("The compound interest is %.2f for %d year.\n", amount, i);
            i++;
        } while (i <= year);
    }
}
