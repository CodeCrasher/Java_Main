public class variableLengthArguments {
    public static void main(String[] args) {
        System.out.println(average(10, 20, 30, 80, 90));
    }

    public static int average(int... num) {
        int total = 0;
        for (int x : num) {
            total += x;
        }
        return total / num.length;
    }
}
