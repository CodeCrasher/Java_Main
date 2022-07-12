import javax.swing.JFrame;
public class eventHandlerMain {
    public static void main(String[] args) {
        eventHandler eh = new eventHandler();
        eh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eh.setSize(350,100);
        eh.setVisible(true);
    }
}
