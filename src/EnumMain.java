import java.util.EnumSet;

public class EnumMain {
    public static void main(String[] args) {
        for (enumP e : enumP.values()) {
            System.out.println(e + "\t" + e.getAge() + "\t" + e.getName());
        }
        System.out.println("======================================");
        for (enumP q : EnumSet.range(enumP.Tishi, enumP.Uday)) {
            System.out.println(q + "\t" + q.getAge() + "\t" + q.getName());
        }
    }
}
