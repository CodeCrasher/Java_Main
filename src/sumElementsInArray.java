import java.util.Scanner;

public class sumElementsInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = scn.nextInt();
        int sum = 0;
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Enter the %d element : ", i+1);
            a[i] = scn.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("The sum of the all the elements in this arrays is " + sum);


    }
}
