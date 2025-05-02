package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class RockPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
<<<<<<< HEAD
    public RockPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Roca Filosa", Type.ROCK, (short) 50, false));
        attacksOfClass.add(new Attack("Puño Rocoso", Type.ROCK, (short) 55, false));
        attacksOfClass.add(new Attack("Impacto de Roca", Type.ROCK, (short) 60, false));
        attacksOfClass.add(new Attack("Tajo de Piedra", Type.ROCK, (short) 65, false));
        attacksOfClass.add(new Attack("Piedra Lanza", Type.ROCK, (short) 60, false));
        attacksOfClass.add(new Attack("Golpe Roca", Type.ROCK, (short) 45, false));
        attacksOfClass.add(new Attack("Desgarro Rocoso", Type.ROCK, (short) 70, false));
        attacksOfClass.add(new Attack("Embate Rocoso", Type.ROCK, (short) 75, false));
        attacksOfClass.add(new Attack("Puño de Piedra", Type.ROCK, (short) 65, false));
        attacksOfClass.add(new Attack("Ataque de Roca", Type.ROCK, (short) 80, false));

        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Bomba de Roca", Type.ROCK, (short) 80, true));
        attacksOfClass.add(new Attack("Lluvia de Meteoritos", Type.ROCK, (short) 95, true));
        attacksOfClass.add(new Attack("Roca Luminosa", Type.ROCK, (short) 75, true));
        attacksOfClass.add(new Attack("Colisión Meteórica", Type.ROCK, (short) 90, true));
        attacksOfClass.add(new Attack("Explosión Rocosa", Type.ROCK, (short) 100, true));
        attacksOfClass.add(new Attack("Avalancha de Piedras", Type.ROCK, (short) 80, true));
        attacksOfClass.add(new Attack("Roca Llameante", Type.ROCK, (short) 70, true));
        attacksOfClass.add(new Attack("Puño Terrón", Type.ROCK, (short) 85, true));
        attacksOfClass.add(new Attack("Tormenta de Rocas", Type.ROCK, (short) 85, true));
        attacksOfClass.add(new Attack("Roca Celestial", Type.ROCK, (short) 90, true));

=======
    public RockPokemon(String name, Type type, double hp, double defense) {
        super(name, type, hp, defense);
        attacksOfClass.add(new Attack("Avalancha", Type.ROCK, 50.0));
        attacksOfClass.add(new Attack("Lanzarrocas", Type.ROCK, 40.0));
        attacksOfClass.add(new Attack("Roca Afilada", Type.ROCK, 60.0));
        attacksOfClass.add(new Attack("Pedrada", Type.ROCK, 45.0));
        attacksOfClass.add(new Attack("Deslizamiento de Rocas", Type.ROCK, 50.0));
        attacksOfClass.add(new Attack("Trampa Rocas", Type.ROCK, 0.0));
        attacksOfClass.add(new Attack("Pulso Roca", Type.ROCK, 35.0));
        attacksOfClass.add(new Attack("Cabeza Roca", Type.ROCK, 55.0));
        attacksOfClass.add(new Attack("Roca Dura", Type.ROCK, 60.0));
        attacksOfClass.add(new Attack("Golpe Roca", Type.ROCK, 30.0));
        attacksOfClass.add(new Attack("Meteorito", Type.ROCK, 65.0));
        attacksOfClass.add(new Attack("Roca Circular", Type.ROCK, 25.0));
        attacksOfClass.add(new Attack("Estribillo de Piedra", Type.ROCK, 50.0));
        attacksOfClass.add(new Attack("Fragmentación", Type.ROCK, 35.0));
        attacksOfClass.add(new Attack("Muro Roca", Type.ROCK, 0.0));
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
            case FLYING -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case GROUND -> effectivity = 0.5;
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
