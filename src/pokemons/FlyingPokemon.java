package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class FlyingPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
    public FlyingPokemon(String name, Type type, double hp, double defense) {
        super(name, type, hp, defense);
        attacksOfClass.add(new Attack("Golpe Aéreo", Type.FLYING, 45.0));
        attacksOfClass.add(new Attack("Vuelo", Type.FLYING, 55.0));
        attacksOfClass.add(new Attack("Ataque Ala", Type.FLYING, 40.0));
        attacksOfClass.add(new Attack("Pájaro Osado", Type.FLYING, 60.0));
        attacksOfClass.add(new Attack("Ala de Acero", Type.FLYING, 50.0));
        attacksOfClass.add(new Attack("Danza Aérea", Type.FLYING, 20.0));
        attacksOfClass.add(new Attack("Remolino", Type.FLYING, 20.0));
        attacksOfClass.add(new Attack("Tornado", Type.FLYING, 35.0));
        attacksOfClass.add(new Attack("Aleteo Rápido", Type.FLYING, 30.0));
        attacksOfClass.add(new Attack("Picotazo", Type.FLYING, 25.0));
        attacksOfClass.add(new Attack("Golpe Pico", Type.FLYING, 35.0));
        attacksOfClass.add(new Attack("Viento Cortante", Type.FLYING, 45.0));
        attacksOfClass.add(new Attack("Corriente Ascendente", Type.FLYING, 0.0));
        attacksOfClass.add(new Attack("Huracán", Type.FLYING, 60.0));
        attacksOfClass.add(new Attack("Doble Ala", Type.FLYING, 50.0));

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
            case ELECTRIC -> effectivity = 0.5;
            case ROCK -> effectivity = 0.5;
            case PLANT -> effectivity = 2.0;
            default -> effectivity = 1.0;
        }
        oponentPokemon.receiveDamage((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity);;
    }
}
