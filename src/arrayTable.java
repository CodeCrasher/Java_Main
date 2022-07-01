import java.util.Scanner;

public class arrayTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scn.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Enter your %d element of the array in the table : ", i);
            a[i] = scn.nextInt();
        }
        System.out.println("The table of the array : \n" + "Index" + "\t" + "Element");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + "\t\t" + a[i]);
        }
    }
}
