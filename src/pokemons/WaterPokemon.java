package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class WaterPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
<<<<<<< HEAD
    public WaterPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Chorro de Agua", Type.WATER, (short) 40, false));
        attacksOfClass.add(new Attack("Puño Acuático", Type.WATER, (short) 45, false));
        attacksOfClass.add(new Attack("Impacto Marítimo", Type.WATER, (short) 50, false));
        attacksOfClass.add(new Attack("Tacleo Acuático", Type.WATER, (short) 35, false));
        attacksOfClass.add(new Attack("Tornado Acuático", Type.WATER, (short) 55, false));
        attacksOfClass.add(new Attack("Pisotón Submarino", Type.WATER, (short) 50, false));
        attacksOfClass.add(new Attack("Garras de Agua", Type.WATER, (short) 45, false));
        attacksOfClass.add(new Attack("Tajo Acuático", Type.WATER, (short) 60, false));
        attacksOfClass.add(new Attack("Fuerza del Mar", Type.WATER, (short) 55, false));
        attacksOfClass.add(new Attack("Golpe Marítimo", Type.WATER, (short) 50, false));


        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Hidrobomba", Type.WATER, (short) 70, true));
        attacksOfClass.add(new Attack("Rayo de Agua", Type.WATER, (short) 65, true));
        attacksOfClass.add(new Attack("Tormenta de Agua", Type.WATER, (short) 75, true));
        attacksOfClass.add(new Attack("Chorro de Hielo", Type.WATER, (short) 55, true));
        attacksOfClass.add(new Attack("Hielo Polar", Type.WATER, (short) 60, true));
        attacksOfClass.add(new Attack("Cascada", Type.WATER, (short) 65, true));
        attacksOfClass.add(new Attack("Lluvia Torrencial", Type.WATER, (short) 70, true));
        attacksOfClass.add(new Attack("Marea Alta", Type.WATER, (short) 80, true));
        attacksOfClass.add(new Attack("Pulso Acuático", Type.WATER, (short) 60, true));
        attacksOfClass.add(new Attack("Lluvia de Gotas", Type.WATER, (short) 50, true));

=======
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
            case GROUND -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case PLANT -> effectivity = 0.5;
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
        oponentPokemon.receiveDamage((Math.abs((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity)));
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
    }
}