package src.pokemons;

import java.util.ArrayList;
import src.actions.Attack;

public class WaterPokemon extends Pokemon {

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
    public void doAttack(Pokemon oponentPokemon, Attack attack) {
        double effectivity;
        switch (oponentPokemon.getType()){
            case GROUND -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case PLANT -> effectivity = 0.5;
            default -> effectivity = 1.0;
        }
        oponentPokemon.receiveDamage((attack.getAttackPower() - oponentPokemon.getDefense())*effectivity);
    }
}