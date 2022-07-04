public class sumElementsInArrayEnhForLoop {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 9, 5};
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum of the elements in the array is " + sum);
    }
}
