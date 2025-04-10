package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class WaterPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
    public WaterPokemon(String name, Type type, double hp, double defense) {
        super(name, type, hp, defense);
        attacksOfClass.add(new Attack("Pistola Agua", Type.WATER, 30.0));
        attacksOfClass.add(new Attack("Hidrobomba", Type.WATER, 65.0));
        attacksOfClass.add(new Attack("Surf", Type.WATER, 60.0));
        attacksOfClass.add(new Attack("Burbuja", Type.WATER, 25.0));
        attacksOfClass.add(new Attack("Aqua Jet", Type.WATER, 40.0));
        attacksOfClass.add(new Attack("Aqua Cola", Type.WATER, 50.0));
        attacksOfClass.add(new Attack("Torrente", Type.WATER, 45.0));
        attacksOfClass.add(new Attack("Danza Lluvia", Type.WATER, 0.0));
        attacksOfClass.add(new Attack("Chorro de Agua", Type.WATER, 35.0));
        attacksOfClass.add(new Attack("Hidroariete", Type.WATER, 55.0));
        attacksOfClass.add(new Attack("Pulso Agua", Type.WATER, 50.0));
        attacksOfClass.add(new Attack("Salpicar", Type.WATER, 0.0));
        attacksOfClass.add(new Attack("Cascada", Type.WATER, 60.0));
        attacksOfClass.add(new Attack("Hidropulso", Type.WATER, 45.0));
        attacksOfClass.add(new Attack("Golpe Agua", Type.WATER, 40.0));

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
            case GROUND -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case PLANT -> effectivity = 0.5;
            default -> effectivity = 1.0;
        }
        oponentPokemon.receiveDamage((Math.abs((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity)));
    }
}