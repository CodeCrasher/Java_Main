public class Composition {
    private String name;
    private toStringTute birthday;

    public Composition(String myname, toStringTute mydate) {
        name = myname;
        birthday = mydate;
    }

    public String toString() {
        return String.format("My name is : %s and my birthday is : %s ", name, birthday);
    }
}
