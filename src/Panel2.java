package src;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel2 {

    
    public Panel2(Container container, CardLayout cardLayout){
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);

        container.add(panel2, "Panel 2");

    }
}
