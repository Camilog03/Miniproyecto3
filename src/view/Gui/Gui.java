package src.view.Gui;
import src.controller.Controller;
import src.model.characters.Trainer;
import src.model.pokemons.Pokemon;
import src.view.View;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Queue;

public class Gui extends JFrame implements View {

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

        panel1 = new Panel1();
        panel2 = new Panel2();
        panel3 = new Panel3();

        container.add(panel1, "panel 1");
        container.add(panel2, "panel 2");
        container.add(panel3, "panel 3");


        setVisible(true);
    }

    @Override
    public void showPanel1() {

    }

    @Override
    public void showPanel2(String blueTrainerName, String redTrainerName, Queue<String> namesBlue, Queue<String> namesRed, Queue<Boolean> aliveBlue, Queue<Boolean> aliveRed) {

        //Poner nombres
        panel2.setTrainerBlueName(blueTrainerName);
        panel2.setTrainerRedName(redTrainerName);

        //Actualizar datos de los pokemones
        panel2.setNamesPokemons(namesBlue, namesRed);
        panel2.updateAlivePokemons(aliveBlue, aliveRed);

        cardLayout.show(container, "panel 2");
    }

    @Override
    public void updatePanel2AlivePokemons(Queue<Boolean> aliveBlue, Queue<Boolean> aliveRed){
        panel2.updateAlivePokemons(aliveBlue, aliveRed);
    }

    @Override
    public void showPanel3() {

    }

    @Override
    public void showMessage(String msg) {

    }

    public void setController(Controller controller) {
        panel1.setController(controller);
        panel2.setController(controller);
    }

    public byte selectPokemon(){

        return 1;
    }
}
