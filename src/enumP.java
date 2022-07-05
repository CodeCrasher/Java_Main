public enum enumP {
    Tishi("Mybuoy", 12),
    AJ("Coolbuoy", 22);

    private String name;
    private int age;

    enumP(String thisname, int myage) {
        name = thisname;
        age = myage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}