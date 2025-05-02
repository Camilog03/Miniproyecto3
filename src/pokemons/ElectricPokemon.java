package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class ElectricPokemon extends Pokemon {


    //Constructor and somes attacks to the type of pokemon
<<<<<<< HEAD
    public ElectricPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Puño Eléctrico", Type.ELECTRIC, (short) 50, false));
        attacksOfClass.add(new Attack("Rayo Corto", Type.ELECTRIC, (short) 45, false));
        attacksOfClass.add(new Attack("Impacto Voltaje", Type.ELECTRIC, (short) 60, false));
        attacksOfClass.add(new Attack("Tacleo Eléctrico", Type.ELECTRIC, (short) 40, false));
        attacksOfClass.add(new Attack("Golpe Relámpago", Type.ELECTRIC, (short) 55, false));
        attacksOfClass.add(new Attack("Puño Trueno", Type.ELECTRIC, (short) 50, false));
        attacksOfClass.add(new Attack("Voltio", Type.ELECTRIC, (short) 60, false));
        attacksOfClass.add(new Attack("Choque Eléctrico", Type.ELECTRIC, (short) 65, false));
        attacksOfClass.add(new Attack("Estallido Voltaico", Type.ELECTRIC, (short) 70, false));
        attacksOfClass.add(new Attack("Rayo Impacto", Type.ELECTRIC, (short) 75, false));

        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Rayo", Type.ELECTRIC, (short) 80, true));
        attacksOfClass.add(new Attack("Trueno", Type.ELECTRIC, (short) 90, true));
        attacksOfClass.add(new Attack("Relámpago", Type.ELECTRIC, (short) 75, true));
        attacksOfClass.add(new Attack("Chispa Eléctrica", Type.ELECTRIC, (short) 60, true));
        attacksOfClass.add(new Attack("Electrocañón", Type.ELECTRIC, (short) 85, true));
        attacksOfClass.add(new Attack("Carga Eléctrica", Type.ELECTRIC, (short) 70, true));
        attacksOfClass.add(new Attack("Destello", Type.ELECTRIC, (short) 65, true));
        attacksOfClass.add(new Attack("Electrochorro", Type.ELECTRIC, (short) 80, true));
        attacksOfClass.add(new Attack("Tornado Eléctrico", Type.ELECTRIC, (short) 90, true));
        attacksOfClass.add(new Attack("Rayo Solar Eléctrico", Type.ELECTRIC, (short) 75, true));

    }

    @Override
    public void doAttack(Pokemon oponentPokemon, byte indexAttackSelected) {

        double effectivity;

=======
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
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
        switch (oponentPokemon.getType()){
            case WATER -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 0.5;
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
        oponentPokemon.receiveDamage(Math.abs((attackSelected.get(indexAttackSelected-1).getAttackPower() - oponentPokemon.getDefense())*effectivity));
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
    }
}
