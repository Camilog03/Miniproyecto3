package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class FlyingPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
<<<<<<< HEAD
    public FlyingPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Puño Volador", Type.FLYING, (short) 50, false));
        attacksOfClass.add(new Attack("Bajo Vuelo", Type.FLYING, (short) 55, false));
        attacksOfClass.add(new Attack("Golpe Áereo", Type.FLYING, (short) 60, false));
        attacksOfClass.add(new Attack("Garras Aéreas", Type.FLYING, (short) 45, false));
        attacksOfClass.add(new Attack("Impacto de Alas", Type.FLYING, (short) 50, false));
        attacksOfClass.add(new Attack("Vuelo Cortante", Type.FLYING, (short) 60, false));
        attacksOfClass.add(new Attack("Ataque de Pluma", Type.FLYING, (short) 50, false));
        attacksOfClass.add(new Attack("Alas Asesinas", Type.FLYING, (short) 70, false));
        attacksOfClass.add(new Attack("Giro Aéreo", Type.FLYING, (short) 55, false));
        attacksOfClass.add(new Attack("Puño Aéreo", Type.FLYING, (short) 65, false));

        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Tormenta de Viento", Type.FLYING, (short) 75, true));
        attacksOfClass.add(new Attack("Rayo Aéreo", Type.FLYING, (short) 85, true));
        attacksOfClass.add(new Attack("Ala de Fuego", Type.FLYING, (short) 70, true));
        attacksOfClass.add(new Attack("Vuelo Veloz", Type.FLYING, (short) 80, true));
        attacksOfClass.add(new Attack("Viento Cortante", Type.FLYING, (short) 60, true));
        attacksOfClass.add(new Attack("Ciclón", Type.FLYING, (short) 85, true));
        attacksOfClass.add(new Attack("Torbellino de Plumas", Type.FLYING, (short) 75, true));
        attacksOfClass.add(new Attack("Lluvia de Aves", Type.FLYING, (short) 90, true));
        attacksOfClass.add(new Attack("Viento Huracanado", Type.FLYING, (short) 80, true));
        attacksOfClass.add(new Attack("Explosión Aérea", Type.FLYING, (short) 95, true));
=======
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
            case ELECTRIC -> effectivity = 0.5;
            case ROCK -> effectivity = 0.5;
            case PLANT -> effectivity = 2.0;
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
