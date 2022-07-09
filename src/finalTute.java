public class finalTute {
    private int sum;
    private final int NUMBER;

    public finalTute(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("The sum is : %d\n", sum);
    }
}
