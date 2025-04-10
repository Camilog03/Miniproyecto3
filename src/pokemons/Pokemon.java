package src.pokemons;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import src.actions.Attack;

public abstract class Pokemon implements Comparable<Pokemon> {
    private final String name;
    private final Type type;
    protected static final byte MAXATTACKS = 4;
    private double hp;
    private double defense;
    private boolean alive = true;
    protected ArrayList<Attack> attacksOfClass = new ArrayList<Attack>();
    protected ArrayList<Attack> attackSelected = new ArrayList<Attack>(MAXATTACKS);

    @Override //Order in which any type of list will order the pokemons (it will order in ascending for their hp)
    public int compareTo(Pokemon other) {
        return Double.compare(this.hp, other.hp);

    }

    //Constructor
    public Pokemon(String name, Type type, double hp, double defense) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.defense = defense;
    }

    //Setters and Getters

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public static byte getMaxAttacks() {return MAXATTACKS;}

    public boolean isAlive() {return alive;}

    //Other methods

    //Attack method that need to be define on each type of pokemon
    public abstract void doAttack(Pokemon oponentPokemon, Scanner scanner);

    //Receive damage method
    public void receiveDamage(double damage){
        this.hp = Math.max(0, this.hp - damage);
        if(this.hp <= 0){
            this.alive = false;
        }
    }

    //Selected the attacks of the pokemon
    public void selectAttack(Scanner scanner){
        System.out.println("----------- ATAQUES DE TIPO "+ type + " -----------");
        for (int i = 0; i < attacksOfClass.size(); i += 2) {
            if (i + 1 < attacksOfClass.size()) {
                System.out.println((i + 1) + ". " + attacksOfClass.get(i) + "\t\t" + (i + 2) + ". " + attacksOfClass.get(i + 1));
            } else {
                System.out.println((i + 1) + ". " + attacksOfClass.get(i));
            }
        }

        System.out.println("----Ingrese los ataques a continuacion----");

        for (int i = 0; i < MAXATTACKS; i++) {
            System.out.print("Ataque #" + (i + 1) + ": ");
            int indexAddPokemonTemp = scanner.nextInt();
            attackSelected.add(attacksOfClass.get(indexAddPokemonTemp - 1));
        }
    }

    //Shows attacks
    public void showsAttacks(){
        for (int i = 0; i < MAXATTACKS; i++) {
            System.out.println((i + 1) + ". " + attackSelected.get(i));
        }
    }

    //Random Attacks generator
    public void selectAttackRandom(){
        Random random = new Random();

        int indexAttack;
        do{
            indexAttack = random.nextInt(attacksOfClass.size());
        }while(attackSelected.contains(attacksOfClass.get(indexAttack)));

        attackSelected.add(attacksOfClass.get(indexAttack));
    }

    //toString method to print the object on the console
    public String toString() {
        return name + "\tTipo:" + type + "\tHP:" + hp + "\tDEF:" + defense + "\tEstado: " + (alive ? "Vivo" : "Muerto");
    }

}
