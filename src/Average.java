import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the frequency of numbers to be averaged:");
        int num = scn.nextInt();

        int total =0,average,counter =0,grade;
        while(counter<num){
            System.out.printf("Enter the %d number",counter+1);
            grade = scn.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/num;
        System.out.println("Average of numbers is "+average);
    }
}
