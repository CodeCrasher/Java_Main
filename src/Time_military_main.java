public class Time_military_main {
    public static void main(String[] args) {
        time_military tm = new time_military();
        tm.setTime(19,17,4);
        System.out.println(tm.toMilitaryTime());
    }
}
