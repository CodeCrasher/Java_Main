public class arraysInMethods {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 7, 8, 9};

        sum(a);
        for (int op : a) {
            System.out.print(op+",");
        }

    }

    public static void sum(int s[]) {
        for (int i = 0; i < s.length; i++) {
            s[i] += 5;
        }
    }
}
