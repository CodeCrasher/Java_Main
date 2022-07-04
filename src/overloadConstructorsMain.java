public class overloadConstructorsMain {
    public static void main(String[] args) {
        overloadConstructors oc = new overloadConstructors();
        overloadConstructors oc_one = new overloadConstructors(5);
        overloadConstructors oc_two = new overloadConstructors(5, 3);
        overloadConstructors oc_three = new overloadConstructors(5, 3, 8);

        System.out.printf("%s\n", oc.toDisplayMilitary());
        System.out.printf("%s\n", oc_one.toDisplayMilitary());
        System.out.printf("%s\n", oc_two.toDisplayMilitary());
        System.out.printf("%s\n", oc_three.toDisplayMilitary());
    }
}
