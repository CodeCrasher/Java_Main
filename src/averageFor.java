import java.util.Scanner;

public class averageFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total = 0, average, counter, grade;
        System.out.println("Enter the frequency of numbers you need the average of :");
        int num = scn.nextInt();
        for (counter = 0; counter < num; counter++) {
            System.out.printf("Enter the %d number :", counter + 1);
            grade = scn.nextInt();
            total = total + grade;
        }
        average = total / num;
        System.out.printf("The average of %d numbers is : %d", num, average);
    }
}
