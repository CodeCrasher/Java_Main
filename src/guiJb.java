import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class guiJb extends JFrame{
    private JButton reg;
    private JButton custom;

    public guiJb(){
        super("The title");
        setLayout(new FlowLayout());

        reg = new JButton("Regular Button");
        add(reg);

        Icon b = new ImageIcon(getClass().getResource("b.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));

        custom = new JButton("Custom",b);
        custom.setRolloverIcon(x);
        add(custom);

    }


}
