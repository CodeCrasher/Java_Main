import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number you need square root of :");
        int sqin = scn.nextInt();
        double sqot = Math.sqrt(sqin);
        System.out.printf("Square root of %d is %.2f\n", sqin, sqot);
        System.out.println("Floor of sqrt is " + Math.floor(sqot));
        System.out.println("Max of sqrt and sqr is " + Math.max(sqin, sqot));
        System.out.println("Min of sqrt and sqr is " + Math.min(sqin, sqot));
        System.out.println("Ceil of sqrt is " + Math.ceil(sqot));
    }
}
