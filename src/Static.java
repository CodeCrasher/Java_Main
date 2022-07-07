public class Static {
    private String fn;
    private String ln;
    private static int members = 0;

    public Static(String first, String last) {
        fn = first;
        ln = last;
        members++;
        System.out.printf("The member name is : %s %s & member number = %d \n", fn, ln, members);
    }

}
