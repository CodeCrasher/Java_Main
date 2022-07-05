public class EnumMain {
    public static void main(String[] args) {
        for (enumP e : enumP.values()) {
            System.out.println(e + "\t" + e.getAge() + "\t" + e.getName());
        }
    }
}
