public class mulitdimensionalArray_1 {
    public static void main(String[] args) {
        int first[][] = {{1, 2, 3, 4}, {89, 90, 91, 233, 4}};
        int second[][] = {{1}, {1, 2}, {1, 2, 3}};
        System.out.println("My first 2D array : ");
        display(first);

        System.out.println("My second 2D array : ");
        display(second);
    }

    public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                System.out.print(x[row][col] + " ");
            }
            System.out.println();
        }
    }
}
