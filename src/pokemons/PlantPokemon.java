package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class PlantPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
    public PlantPokemon(String name, Type type, double hp, double defense) {
        super(name, type, hp, defense);
        attacksOfClass.add(new Attack("Latigazo", Type.PLANT, 35.0));
        attacksOfClass.add(new Attack("Hoja Afilada", Type.PLANT, 45.0));
        attacksOfClass.add(new Attack("Látigo Cepa", Type.PLANT, 30.0));
        attacksOfClass.add(new Attack("Rayo Solar", Type.PLANT, 65.0));
        attacksOfClass.add(new Attack("Drenadoras", Type.PLANT, 30.0));
        attacksOfClass.add(new Attack("Gigadrenado", Type.PLANT, 55.0));
        attacksOfClass.add(new Attack("Energibola", Type.PLANT, 50.0));
        attacksOfClass.add(new Attack("Hoja Mágica", Type.PLANT, 40.0));
        attacksOfClass.add(new Attack("Fitoimpulso", Type.PLANT, 45.0));
        attacksOfClass.add(new Attack("Danza Pétalo", Type.PLANT, 60.0));
        attacksOfClass.add(new Attack("Polvo Veneno", Type.PLANT, 0.0));
        attacksOfClass.add(new Attack("Síntesis", Type.PLANT, 0.0));
        attacksOfClass.add(new Attack("Follaje", Type.PLANT, 25.0));
        attacksOfClass.add(new Attack("Hoja Aguda", Type.PLANT, 50.0));
        attacksOfClass.add(new Attack("Esporas", Type.PLANT, 70.0));


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
            case WATER -> effectivity = 2.0;
            case GROUND -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 0.5;
            case PLANT -> effectivity = 0.5;
            case FLYING -> effectivity = 0.5;
            default -> effectivity = 1.0;
        }
        oponentPokemon.receiveDamage((Math.abs((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity)));;
    }
}
