package src.entrenador;

import java.util.ArrayList;
import src.pokemons.Pokemon;
import src.pokemons.Type;



public class Entrenador {
    private String trainerName;
    private ArrayList<Pokemon> list = new ArrayList<Pokemon>();
    private static final byte MAX_POKEMON = 3;

    public Entrenador(String trainerName, ArrayList<Pokemon> list) {
        this.trainerName = trainerName;
        this.list = new ArrayList<Pokemon>();
    }
    //Getters and setters
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public ArrayList<Pokemon> getList() {
        return list;
    }

    public void setList(ArrayList<Pokemon> list) {
        this.list = list;
    }

    public static byte getMaxPokemon() {
        return MAX_POKEMON;
    }
    
    //Method to add pokemon to team randomly
    public void addRandomPokemon(){
             
    }
    
    //Method to add pokemon created by the trainer
    public void addCreatedPokemon(){
        
    }
    //Method to sort pokemon from least to most health
    public void Sortlist(){
        
    }

}
