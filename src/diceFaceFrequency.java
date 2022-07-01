import java.util.Random;
import java.util.Scanner;

public class diceFaceFrequency {
    public static void main(String[] args) {
        Random r = new Random();
        int freq[] = new int[7];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of times you want to roll the dice : ");
        int rnum = scn.nextInt();
        for (int roll = 1; roll <= rnum; roll++) {
            ++freq[1 + r.nextInt(6)];
        }
        System.out.println("Face" + "\t" + "Frequency");
        for (int face = 1; face < freq.length; face++) {
            System.out.println(face + "\t\t\t" + freq[face]);
        }
    }
}
