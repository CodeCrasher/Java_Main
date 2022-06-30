public class multimethod {
    String fname;

    public multimethod(String name){
        fname = name;
    }
    public void setname(String name){
        fname = name;
    }
    public String getName(){
        return fname;
    }
    public void output(){
        System.out.printf("Fruits added were:%s",getName());
    }
}
