import java.util.Scanner;

public class Time_military_main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int hh, mm, ss;
        System.out.print("Enter hours:");
        hh = scn.nextInt();
        System.out.print("Enter minutes:");
        mm = scn.nextInt();
        System.out.print("Enter seconds:");
        ss = scn.nextInt();
        time_military tm = new time_military();
        tm.setTime(hh, mm, ss);
        System.out.println(tm.toMilitaryTime());
        System.out.println(tm.toRegularTime());
    }
}
