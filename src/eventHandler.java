import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class eventHandler extends JFrame {
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passField;

    public eventHandler() {
        super("My Title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);
        item2 = new JTextField("Enter here!!");
        add(item2);
        item3 = new JTextField("Uneditable", 20);
        item3.setEditable(false);
        add(item3);
        passField = new JPasswordField("myPass");
        add(passField);

        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passField.addActionListener(handler);
    }

}
