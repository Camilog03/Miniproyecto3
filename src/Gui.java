package src;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    private Container container;
    private CardLayout cardLayout;
    private Panel1 panel1;
    private Panel2 panel2;
    private Panel3 panel3;

    public Gui(){
        setTitle("BATALLA POKEMON");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        container = getContentPane();
        container.setLayout(cardLayout);

        panel1 = new Panel1(container, cardLayout);
        panel2 = new Panel2(container, cardLayout);
        panel3 = new Panel3(container, cardLayout);

        container.add(panel1, "1");
        container.add(panel2, "2");
        container.add(panel3, "3");

        setVisible(true);
    }

    public void showPanel2() {
        String trainerName1 = panel1.getTrainerName1();
        String trainerName2 = panel1.getTrainerName2();
        panel2.setTrainerName1(trainerName1);
        panel2.setTrainerName2(trainerName2);
        cardLayout.show(container, "2");
    }

    public void showPanel3(String pokemonLeft, String pokemonRight) {
        String trainerName1 = panel1.getTrainerName1();
        String trainerName2 = panel1.getTrainerName2();
        panel3.setBlueTrainerName(trainerName1);
        panel3.setRedTrainerName(trainerName2);
        panel3.setBluePokemonName(pokemonLeft);
        panel3.setRedPokemonName(pokemonRight);
        cardLayout.show(container, "3");
    }

    public static void main(String[] args) {
        new Gui(); // Crear y mostrar la ventana principal
    }

}
