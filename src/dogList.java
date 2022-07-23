public class dogList {
    private dog[] listOfDogs = new dog[5];
    private int i = 0;

    public void add(dog d) {
        if (i < listOfDogs.length) {
            listOfDogs[i] = d;
            System.out.println("The dog is added at index : " + i);
            i++;
        }
    }
}
