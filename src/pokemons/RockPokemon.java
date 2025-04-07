package src.pokemons;

import java.util.ArrayList;
import src.actions.Attack;

public class RockPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
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

    }

    @Override
    public void doAttack(Pokemon oponentPokemon, Attack attack) {
        double effectivity;
        switch (oponentPokemon.getType()){
            case FLYING -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case GROUND -> effectivity = 0.5;
            default -> effectivity = 1.0;
        }
        oponentPokemon.receiveDamage((attack.getAttackPower() - oponentPokemon.getDefense())*effectivity);
    }
}
