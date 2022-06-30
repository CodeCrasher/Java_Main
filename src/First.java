import java.util.Scanner;

public class First {
        public static void main(String[] args){
                Scanner sname = new Scanner(System.in);
                System.out.println("Enter the name of fruits:");
//                String name = sname.nextLine();
//                Second s = new Second();
//                s.message(name);
                String fruits = sname.nextLine();
                multimethod m = new multimethod("Orange");
//                m.setname(fruits);
                m.output();
        }
}
