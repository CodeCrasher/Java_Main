public class polymorphismMain {
    public static void main(String[] args) {
        polymorphismSuper p[] = new polymorphismSuper[2];
        p[0] = new polymorphismMin();
        p[1] = new polymorphismMax();

        for (int x = 0; x < p.length; x++) {
            p[x].value();
        }
    }
}
