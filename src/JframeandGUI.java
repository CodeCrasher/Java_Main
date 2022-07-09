import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JframeandGUI extends JFrame {
    private JLabel item1;

    public JframeandGUI() {
        super("The Title Bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a message");
        item1.setToolTipText("Hover and see me and Hover again!!!");
        add(item1);
    }

    public void getDefaultCloseOperation(int exitOnClose) {
    }
}
