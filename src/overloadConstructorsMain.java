import java.util.Scanner;

public class overloadConstructorsMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int hh, mm, ss;
        System.out.print("Enter hours:");
        hh = scn.nextInt();
        System.out.print("Enter minutes:");
        mm = scn.nextInt();
        System.out.print("Enter seconds:");
        ss = scn.nextInt();

        overloadConstructors oc = new overloadConstructors();
        overloadConstructors oc_one = new overloadConstructors(hh);
        overloadConstructors oc_two = new overloadConstructors(hh, mm);
        overloadConstructors oc_three = new overloadConstructors(hh,mm,ss);

        System.out.printf("%s\n", oc.toDisplayMilitary());
        System.out.printf("%s\n", oc_one.toDisplayMilitary());
        System.out.printf("%s\n", oc_two.toDisplayMilitary());
        System.out.printf("%s\n", oc_three.toDisplayMilitary());
    }
}
