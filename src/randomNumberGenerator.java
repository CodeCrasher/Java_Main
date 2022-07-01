import java.util.Random;
import java.util.Scanner;

public class randomNumberGenerator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random dice = new Random();

        int num, roll;

        System.out.println("Enter the number of times you want to roll the dice");
        roll = scn.nextInt();

        for (int i = 1; i <= roll; i++) {
            num = 1 + dice.nextInt(6); //Since the random object takes initial value as 0
            System.out.printf("The random number for %d attempt is %d \n", i, num);
        }

    }
}
