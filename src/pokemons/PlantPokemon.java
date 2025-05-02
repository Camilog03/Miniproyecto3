package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class PlantPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
<<<<<<< HEAD
    public PlantPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {

        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Latigazo", Type.PLANT, (short) 35, false));
        attacksOfClass.add(new Attack("Hoja Afilada", Type.PLANT, (short) 45, false));
        attacksOfClass.add(new Attack("Látigo Cepa", Type.PLANT, (short) 30, false));
        attacksOfClass.add(new Attack("Fitoimpulso", Type.PLANT, (short) 45, false));
        attacksOfClass.add(new Attack("Hoja Aguda", Type.PLANT, (short) 50, false));
        attacksOfClass.add(new Attack("Embate Verde", Type.PLANT, (short) 40, false));
        attacksOfClass.add(new Attack("Puya Espinosa", Type.PLANT, (short) 35, false));
        attacksOfClass.add(new Attack("Tacleo Floral", Type.PLANT, (short) 25, false));
        attacksOfClass.add(new Attack("Corte Hoja", Type.PLANT, (short) 40, false));
        attacksOfClass.add(new Attack("Ira Botánica", Type.PLANT, (short) 55, false));

        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Rayo Solar", Type.PLANT, (short) 65, true));
        attacksOfClass.add(new Attack("Gigadrenado", Type.PLANT, (short) 55, true));
        attacksOfClass.add(new Attack("Energibola", Type.PLANT, (short) 50, true));
        attacksOfClass.add(new Attack("Hoja Mágica", Type.PLANT, (short) 40, true));
        attacksOfClass.add(new Attack("Danza Pétalo", Type.PLANT, (short) 60, true));
        attacksOfClass.add(new Attack("Follaje", Type.PLANT, (short) 25, true));
        attacksOfClass.add(new Attack("Tempestad Floral", Type.PLANT, (short) 60, true));
        attacksOfClass.add(new Attack("Explosión Verde", Type.PLANT, (short) 70, true));
        attacksOfClass.add(new Attack("Esfera Espora", Type.PLANT, (short) 50, true));
        attacksOfClass.add(new Attack("Tormenta de Hojas", Type.PLANT, (short) 60, true));

=======
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
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef


    }

    @Override
<<<<<<< HEAD
    public void doAttack(Pokemon oponentPokemon, byte indexAttackSelected) {

=======
    public void doAttack(Pokemon oponentPokemon, Scanner scanner) {
        System.out.println("\t\tAtaques");
        for (int i = 0; i < MAXATTACKS; i++) {
            System.out.println((i + 1) + ". " + attackSelected.get(i));
        }

        int indexAttackSelected = scanner.nextInt();
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
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
<<<<<<< HEAD
        Attack selectedAttack = attacksInstance.get(indexAttackSelected);

        double damage;

        if (selectedAttack.isSpecial()) {
            damage = ((selectedAttack.getAttackPower()) / (double) oponentPokemon.getDefenseSpecial()) + 2;
        } else {
            damage = ((selectedAttack.getAttackPower()) / (double) oponentPokemon.getDefenseFisic()) + 2;
        }

        oponentPokemon.receiveDamage((short)(damage*effectivity));
=======
        oponentPokemon.receiveDamage((Math.abs((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity)));;
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
    }
}
