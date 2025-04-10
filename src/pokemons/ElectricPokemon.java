package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class ElectricPokemon extends Pokemon {


    //Constructor and somes attacks to the type of pokemon
    public ElectricPokemon(String name, Type type, double hp, double defense) {
        super(name, type, hp, defense);
        attacksOfClass.add(new Attack("Impactrueno", Type.ELECTRIC, 35.0));
        attacksOfClass.add(new Attack("Trueno", Type.ELECTRIC, 60.0));
        attacksOfClass.add(new Attack("Rayo", Type.ELECTRIC, 55.0));
        attacksOfClass.add(new Attack("Chispa", Type.ELECTRIC, 40.0));
        attacksOfClass.add(new Attack("Electrocañón", Type.ELECTRIC, 65.0));
        attacksOfClass.add(new Attack("Puño Trueno", Type.ELECTRIC, 50.0));
        attacksOfClass.add(new Attack("Voltio Cruel", Type.ELECTRIC, 60.0));
        attacksOfClass.add(new Attack("Onda Trueno", Type.ELECTRIC, 20.0));
        attacksOfClass.add(new Attack("Electropatada", Type.ELECTRIC, 45.0));
        attacksOfClass.add(new Attack("Carga", Type.ELECTRIC, 10.0));
        attacksOfClass.add(new Attack("Voltiocambio", Type.ELECTRIC, 50.0));
        attacksOfClass.add(new Attack("Chispa Salvaje", Type.ELECTRIC, 55.0));
        attacksOfClass.add(new Attack("Electropulso", Type.ELECTRIC, 35.0));
        attacksOfClass.add(new Attack("Campo Eléctrico", Type.ELECTRIC, 0.0));
        attacksOfClass.add(new Attack("Electroshock", Type.ELECTRIC, 40.0));
    }

    @Override
    public void doAttack(Pokemon oponentPokemon, Scanner scanner) {
        System.out.println("\t\tAtaques");
        for (int i = 0; i < MAXATTACKS; i++) {
            System.out.println((i + 1) + ". " + attackSelected.get(i));
        }


        int indexAttackSelected;
        indexAttackSelected = scanner.nextInt();
        double effectivity;
        switch (oponentPokemon.getType()){
            case WATER -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 0.5;
            default -> effectivity = 1.0;
        }

        oponentPokemon.receiveDamage((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity);
    }
}
