package src;

import src.characters.Trainer;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private Trainer trainer1;
    private Trainer trainer2;
    private Container container;
    private CardLayout cardLayout;
    private Panel1 panel1;
    private Panel2 panel2;
    private Panel3 panel3;
    public Gui(){
        setTitle("BATALLA POKEMON");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        trainer1 = new Trainer("");
        trainer2 = new Trainer("");
        trainer1.randomPokemon();
        trainer2.randomPokemon();

        cardLayout = new CardLayout();
        container = getContentPane();
        container.setLayout(cardLayout);

        panel1 = new Panel1(container, cardLayout, this);
        panel2 = new Panel2(container, cardLayout, this);
        panel3 = new Panel3(container, cardLayout, this);

        container.add(panel1, "1");
        container.add(panel2, "2");
        container.add(panel3, "3");

        setVisible(true);
    }

    public void showPanel2() {
        panel2.setTrainerName1(trainer1.getTrainerName());
        panel2.setTrainerName2(trainer2.getTrainerName());
        cardLayout.show(container, "2");
    }

    public void showPanel3(byte indexPLeft, byte indexPRight) {
        panel3.setBlueTrainerName(trainer1.getTrainerName());
        panel3.setRedTrainerName(trainer2.getTrainerName());
        panel3.setBluePokemonName(trainer1.getSelectedPokemon(indexPLeft).getName());
        panel3.setRedPokemonName(trainer2.getSelectedPokemon(indexPRight).getName());
        cardLayout.show(container, "3");
    }



    public Trainer getTrainer1() {
        return trainer1;
    }

    public void setTrainer1(Trainer trainer1) {
        this.trainer1 = trainer1;
    }

    public Trainer getTrainer2() {
        return trainer2;
    }

    public void setTrainer2(Trainer trainer2) {
        this.trainer2 = trainer2;
    }

    public static void main(String[] args) {
        new Gui(); // Crear y mostrar la ventana principal
    }

}
