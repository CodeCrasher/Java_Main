import java.util.Scanner;

public class arrayIntro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d element of the array: ", i);
            arr[i] = scn.nextInt();
            System.out.println("The array is : " + arr[i]);
        }
    }
}

