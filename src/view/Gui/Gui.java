package src.view.Gui;

import src.model.characters.Trainer;
import src.model.pokemons.Pokemon;
import src.view.View;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame implements View {

    private Trainer trainerBlue;
    private Trainer trainerRed;
    private Container container;
    private CardLayout cardLayout;
    private Panel1 panel1;
    private Panel2 panel2;
    private Panel3 panel3;
    public Gui(){
        setTitle("BATALLA POKEMON");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        trainerBlue = new Trainer("");
        trainerRed = new Trainer("");
        trainerBlue.randomPokemon();
        trainerRed.randomPokemon();

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
        panel2.setTrainerName1(trainerBlue.getTrainerName());
        panel2.setTrainerName2(trainerRed.getTrainerName());
        panel2.updateAlivePokemons();
        byte counterBlue = 0;
        byte counterRed = 0;
        for(Pokemon po:trainerBlue.getSelectPokemonslist()){
            if(!po.isAlive()){
                counterBlue++;
            }
        }
        for(Pokemon po:trainerRed.getSelectPokemonslist()){
            if(!po.isAlive()){
                counterRed++;
            }
        }
        if(counterBlue == 3 || counterRed == 3){
            JOptionPane.showMessageDialog(this, "Gana el entrenador "+ (counterBlue==3?"Rojo: "+trainerRed.getTrainerName():"Azul: "+trainerBlue.getTrainerName()) +
                    "\nFelicidades!!!!!!"+
                    "\nEl juego ha FINALIZADO...");
            System.exit(0);
        }


        cardLayout.show(container, "2");
    }

    public void showPanel3(byte indexPokemonBlue, byte indexPokemonRed) {
        JOptionPane.showMessageDialog(this, "Inicia el " + (trainerBlue.getSelectedPokemon(indexPokemonBlue).getSpeed() > trainerRed.getSelectedPokemon(indexPokemonRed).getSpeed()? "Entrenador Azul":"Entrenador Rojo"));
        System.out.println(trainerBlue.getSelectedPokemon(indexPokemonBlue).getSpeed() + " " + trainerRed.getSelectedPokemon(indexPokemonRed).getSpeed());
        panel3.setPokemonIndexes(indexPokemonBlue, indexPokemonRed);
        panel3.setBlueTrainerName(trainerBlue.getTrainerName());
        panel3.setRedTrainerName(trainerRed.getTrainerName());
        panel3.setBluePokemonName(trainerBlue.getSelectedPokemon(indexPokemonBlue).getName());
        panel3.setRedPokemonName(trainerRed.getSelectedPokemon(indexPokemonRed).getName());
        panel3.updateHpLabels();
        ImageIcon bluePokemonImageIcon = new ImageIcon(new ImageIcon(trainerBlue.getSelectedPokemon(indexPokemonBlue).getPath())
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon redPokemonImageIcon = new ImageIcon(new ImageIcon(trainerRed.getSelectedPokemon(indexPokemonRed).getPath())
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        panel3.setBluePokemonImage(bluePokemonImageIcon);
        panel3.setRedPokemonImage(redPokemonImageIcon);

        cardLayout.show(container, "3");
    }

    public Trainer getTrainerBlue() {
        return trainerBlue;
    }

    public void setTrainerBlue(Trainer trainerBlue) {
        this.trainerBlue = trainerBlue;
    }

    public Trainer getTrainerRed() {
        return trainerRed;
    }

    public void setTrainerRed(Trainer trainerRed) {
        this.trainerRed = trainerRed;
    }

    public Panel2 getPanel2(){
        return panel2;}

}
