import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador {
    private String coachName;
    private ArrayList<Pokemon> list = new ArrayList<Pokemon>();
    private static final byte MAX_POKEMON = 3;

    public Entrenador(String coachName, ArrayList<Pokemon> list) {
        this.coachName = coachName;
        this.list = new ArrayList<Pokemon>();
    }
    //Getters and setters
    public String getCoachName() {
        return coachName;
    }
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
    public ArrayList<Pokemon> getList() {
        return list;
    }
    public void setList(ArrayList<Pokemon> list) {
        this.list = list;
    }
    
    //Method to add pokemon to team
    public void addPokemon(Pokemon pokemon){
        if(list.size() <MAX_POKEMON){
            list.add(pokemon);
            System.out.println(getCoachName() + " has choosen: "+ pokemon);
        }
        else{
            System.out.println("Full team");
        }        
    }
    //Method to choose a pokemon from all pokemons
    public void choosePokemon(ArrayList<Pokemon> available){
        Scanner sc = new Scanner(System.in);
        byte option;
        System.out.println("Available Pokémon:");
        for (int i = 0; i < available.size(); i++) {
            System.out.println((i + 1) + ". " + available.get(i));
        }
    
        while(list.size() < MAX_POKEMON){
            System.out.println("Choose your pokemon number: ");
            option = sc.nextByte();
            if(option<1 || option > available.size() ){
                System.out.println("Invalid choice");
            }else{
            addPokemon(available.get(option-1));
            }
        }
        sc.close();
    }
}
