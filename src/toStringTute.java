public class toStringTute {
    private int day;
    private int month;
    private int year;

    public toStringTute(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

        System.out.printf("The date for today is : %s\n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
