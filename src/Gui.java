package src;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    private Container container;
    private CardLayout cardLayout;
    private Panel1 panel1;
    private Panel2 panel2;

    public Gui(){
        setTitle("BATALLA POKEMON");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        container = getContentPane();
        container.setLayout(cardLayout);

        panel1 = new Panel1(container, cardLayout);
        container.add(panel1, "1");

        setVisible(true);

    }
    
    public static void main(String[] args) {
        new Gui(); // Crear y mostrar la ventana principal
    }

}
