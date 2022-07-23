public class animalList {
    private animal[] theList = new animal[5];
    private int i = 0;

    public void add(animal a) {
        if (i < theList.length) {
            theList[i] = a;
            System.out.println("The animal got added in the index : " + i);
            i++;
        }
    }
}
