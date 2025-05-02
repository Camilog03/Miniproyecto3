package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class GroundPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
<<<<<<< HEAD
    public GroundPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Terremoto", Type.GROUND, (short) 80, false));
        attacksOfClass.add(new Attack("Golpe de Arena", Type.GROUND, (short) 50, false));
        attacksOfClass.add(new Attack("Pisotón Terrestre", Type.GROUND, (short) 55, false));
        attacksOfClass.add(new Attack("Corte Rocoso", Type.GROUND, (short) 60, false));
        attacksOfClass.add(new Attack("Bucle Subterráneo", Type.GROUND, (short) 65, false));
        attacksOfClass.add(new Attack("Puño Tierra", Type.GROUND, (short) 70, false));
        attacksOfClass.add(new Attack("Impacto de Tierra", Type.GROUND, (short) 75, false));
        attacksOfClass.add(new Attack("Desgarro Subterráneo", Type.GROUND, (short) 85, false));
        attacksOfClass.add(new Attack("Tajo Subterráneo", Type.GROUND, (short) 55, false));
        attacksOfClass.add(new Attack("Sacudida Terrestre", Type.GROUND, (short) 60, false));

        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Roca Filosa", Type.GROUND, (short) 70, true));
        attacksOfClass.add(new Attack("Sismo", Type.GROUND, (short) 85, true));
        attacksOfClass.add(new Attack("Terremoto Infernal", Type.GROUND, (short) 95, true));
        attacksOfClass.add(new Attack("Cañón de Arena", Type.GROUND, (short) 80, true));
        attacksOfClass.add(new Attack("Tsunami Subterráneo", Type.GROUND, (short) 90, true));
        attacksOfClass.add(new Attack("Terraforma", Type.GROUND, (short) 75, true));
        attacksOfClass.add(new Attack("Bomba Lodo", Type.GROUND, (short) 80, true));
        attacksOfClass.add(new Attack("Puño Rocoso", Type.GROUND, (short) 70, true));
        attacksOfClass.add(new Attack("Torbellino de Tierra", Type.GROUND, (short) 85, true));
        attacksOfClass.add(new Attack("Rugido de la Tierra", Type.GROUND, (short) 75, true));

=======
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
            case ELECTRIC -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case PLANT -> effectivity = 5.0;
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