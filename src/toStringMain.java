import java.util.Scanner;

public class toStringMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String Name;
        int day, month, year;
        System.out.println("Enter your name:");
        Name = scn.next();
        System.out.println("Enter day:");
        day = scn.nextInt();
        System.out.println("Enter Month:");
        month = scn.nextInt();
        System.out.println("Enter year:");
        year = scn.nextInt();
        toStringTute ts = new toStringTute(day, month, year);
        Composition c = new Composition(Name, ts);

        System.out.println(c);
    }
}
