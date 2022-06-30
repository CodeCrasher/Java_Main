import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int age;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = c.nextInt();
        System.out.println(age > 50 ? "Damn,you're old!!" : "ehh,you're young damn it");
    }
}
