package src.controller;

import src.model.characters.Trainer;
import src.model.pokemons.Pokemon;
import src.view.Terminal.Terminal;
import src.view.View;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Controller {

    private View view;
    private Trainer trainerBlue;
    private Trainer trainerRed;
    private Queue<String> namesBlue;
    private Queue<String> namesRed;
    private Queue<Boolean> alivesBlue;
    private Queue<Boolean> alivesRed;

    public Controller(View view,  Trainer trainerBlue, Trainer trainerRed) {
        this.view = view;
        this.trainerBlue = trainerBlue;
        this.trainerRed = trainerRed;

        //Random pokemons
        this.trainerBlue.randomPokemon();
        this.trainerRed.randomPokemon();
        this.view.setController(this);
    }

    public void setTrainersNames(String trainerBlueName,  String trainerRedName) {
        trainerBlue.setTrainerName(trainerBlueName);
        trainerRed.setTrainerName(trainerRedName);
        System.out.println(trainerRed.getTrainerName());
        System.out.println(trainerBlue.getTrainerName());
    }

    public void goToPanel2(){

        //Colas de nombres de los pokemones

        namesBlue = new LinkedList<>();
        namesBlue.add(trainerBlue.getSelectPokemonslist().get(0).getName());
        namesBlue.add(trainerBlue.getSelectPokemonslist().get(1).getName());
        namesBlue.add(trainerBlue.getSelectPokemonslist().get(2).getName());

        namesRed = new LinkedList<>();
        namesRed.add(trainerRed.getSelectPokemonslist().get(0).getName());
        namesRed.add(trainerRed.getSelectPokemonslist().get(1).getName());
        namesRed.add(trainerRed.getSelectPokemonslist().get(2).getName());

        //Colas de estado del los pokemones

        alivesBlue = new LinkedList<>();
        alivesBlue.add(trainerBlue.getSelectPokemonslist().get(0).isAlive());
        alivesBlue.add(trainerBlue.getSelectPokemonslist().get(1).isAlive());
        alivesBlue.add(trainerBlue.getSelectPokemonslist().get(2).isAlive());

        alivesRed = new LinkedList<>();
        alivesRed.add(trainerRed.getSelectPokemonslist().get(0).isAlive());
        alivesRed.add(trainerRed.getSelectPokemonslist().get(1).isAlive());
        alivesRed.add(trainerRed.getSelectPokemonslist().get(2).isAlive());

        view.showPanel2(trainerBlue.getTrainerName(), trainerRed.getTrainerName(), namesBlue, namesRed, alivesBlue, alivesRed);
    }

    public void goToPanel3(byte indexBlue, byte indexRed){
    //Funcion panel 3
    }
    /*public void Ganador(){
        byte counterBlue = 0;
        byte counterRed = 0;
        for(Pokemon po:){
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
    }*/


}
