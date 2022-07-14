public class polyArgMain {
    public static void main(String[] args) {
        PolyArguments pa = new PolyArguments();
        polymorphismSuper vmin = new polymorphismMin();
        polymorphismSuper vmax = new polymorphismMax();

        pa.takeValue(vmin);
        pa.takeValue(vmax);
    }
}
