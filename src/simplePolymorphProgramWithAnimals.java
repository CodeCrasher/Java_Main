public class simplePolymorphProgramWithAnimals {
    public static void main(String[] args) {
        animal[] thelist = new animal[2];
        dog d = new dog();
        fish f = new fish();

        thelist[0] = d;
        thelist[1] = f;

        for (animal a : thelist) {
            a.noise();
        }
    }
}
