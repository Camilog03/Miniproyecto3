package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class GroundPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
    public GroundPokemon(String name, Type type, double hp, double defense) {
        super(name, type, hp, defense);
        attacksOfClass.add(new Attack("Terremoto", Type.GROUND, 60.0));
        attacksOfClass.add(new Attack("Excavar", Type.GROUND, 50.0));
        attacksOfClass.add(new Attack("Fuerza Tierra", Type.GROUND, 55.0));
        attacksOfClass.add(new Attack("Disparo Lodo", Type.GROUND, 30.0));
        attacksOfClass.add(new Attack("Bofetón Lodo", Type.GROUND, 35.0));
        attacksOfClass.add(new Attack("Magnitud", Type.GROUND, 45.0));
        attacksOfClass.add(new Attack("Ataque Arena", Type.GROUND, 25.0));
        attacksOfClass.add(new Attack("Cañón de Tierra", Type.GROUND, 40.0));
        attacksOfClass.add(new Attack("Hundimiento", Type.GROUND, 60.0));
        attacksOfClass.add(new Attack("Terratemblor", Type.GROUND, 50.0));
        attacksOfClass.add(new Attack("Golpe Arena", Type.GROUND, 20.0));
        attacksOfClass.add(new Attack("Barrida", Type.GROUND, 35.0));
        attacksOfClass.add(new Attack("Lodo", Type.GROUND, 30.0));
        attacksOfClass.add(new Attack("Trampa Rocas", Type.GROUND, 40.0));
        attacksOfClass.add(new Attack("Arena Ardiente", Type.GROUND, 40.0));

    }

    @Override
    public void doAttack(Pokemon oponentPokemon, Scanner scanner) {
        System.out.println("\t\tAtaques");
        for (int i = 0; i < MAXATTACKS; i++) {
            System.out.println((i + 1) + ". " + attackSelected.get(i));
        }

        int indexAttackSelected = scanner.nextInt();
        double effectivity;
        switch (oponentPokemon.getType()){
            case ELECTRIC -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case PLANT -> effectivity = 5.0;
            default -> effectivity = 1.0;
        }
        oponentPokemon.receiveDamage((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity);;
    }
}