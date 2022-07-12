public class polyArgMain {
    public static void main(String[] args) {
        PolyArguments pa = new PolyArguments();
        polymorphismSuper v = new polymorphismSuper();
        polymorphismSuper vmin = new polymorphismMin();
        polymorphismSuper vmax = new polymorphismMax();

        pa.takeValue(v);
        pa.takeValue(vmin);
        pa.takeValue(vmax);
    }
}
