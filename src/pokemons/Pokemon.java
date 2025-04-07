package src.pokemons;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import src.actions.Attack;

public abstract class Pokemon implements Comparable<Pokemon> {
    private final String name;
    private final Type type;
    private static final byte MAXATTACKS = 4;
    private double hp;
    private double defense;
    private boolean alive = true;
    protected static ArrayList<Attack> attacksOfClass = new ArrayList<Attack>();
    private ArrayList<Attack> attackSelected = new ArrayList<Attack>(MAXATTACKS);

    @Override
    public int compareTo(Pokemon other) {
        return Double.compare(this.hp, other.hp);

    }

    public Pokemon(String name, Type type, double hp, double defense) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.defense = defense;
    }

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

    public boolean isAlive() {return alive;}

    public static byte getMaxAttacks() {return MAXATTACKS;}

    public abstract void doAttack(Pokemon oponentPokemon,Attack attack);

    public void receiveDamage(double damage){
        this.hp -= Math.max(0, this.hp - damage);
        if(this.hp <= 0){
            this.alive = false;
        }
    }

    public void selectAttack(Scanner scanner){
        for (int i = 0; i < attacksOfClass.size(); i += 2) {
            if (i + 1 < attacksOfClass.size()) {
                System.out.println((i + 1) + ". " + attacksOfClass.get(i) + " " + (i + 2) + ". " + attacksOfClass.get(i + 1));
            } else {
                // Si hay un elemento sin pareja (cantidad impar)
                System.out.println((i + 1) + ". " + attacksOfClass.get(i));
            }
        }

        System.out.println("----Ingrese los ataques a continuacion----");

        for (int i = 0; i < MAXATTACKS; i++) {
            System.out.print("Ataque #"+(i+1)+ ": ");
            int indexAddPokemonTemp = scanner.nextInt();
            attackSelected.add(attacksOfClass.get(indexAddPokemonTemp));
        }

    }

    public void selectAttackRandom(int indexRandomAttack){
        attackSelected.add(attacksOfClass.get(indexRandomAttack));
    }

    public String toString() {
        return name + " " + type + " " + hp + " " + defense + " " + attackSelected;
    }

}
