package src.pokemons;

import java.util.ArrayList;
import src.actions.Attack;

public class FirePokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
    public FirePokemon(String name, Type type, double hp, double defense) {
        super(name, type, hp, defense);
        attacksOfClass.add(new Attack("Ascuas", Type.FIRE, 30.0));
        attacksOfClass.add(new Attack("Lanzallamas", Type.FIRE, 55.0));
        attacksOfClass.add(new Attack("Giro Fuego", Type.FIRE, 35.0));
        attacksOfClass.add(new Attack("Rueda Fuego", Type.FIRE, 40.0));
        attacksOfClass.add(new Attack("Nitrocarga", Type.FIRE, 45.0));
        attacksOfClass.add(new Attack("Colmillo Ígneo", Type.FIRE, 50.0));
        attacksOfClass.add(new Attack("Llama Infernal", Type.FIRE, 60.0));
        attacksOfClass.add(new Attack("Puño Fuego", Type.FIRE, 50.0));
        attacksOfClass.add(new Attack("Anillo Ígneo", Type.FIRE, 45.0));
        attacksOfClass.add(new Attack("Erupción", Type.FIRE, 65.0));
        attacksOfClass.add(new Attack("Calcinación", Type.FIRE, 35.0));
        attacksOfClass.add(new Attack("Fuego Sagrado", Type.FIRE, 60.0));
        attacksOfClass.add(new Attack("Envite Ígneo", Type.FIRE, 55.0));
        attacksOfClass.add(new Attack("Llama Azul", Type.FIRE, 65.0));
        attacksOfClass.add(new Attack("Fuego Fatuo", Type.FIRE, 20.0));

    }

    @Override
    public void doAttack(Pokemon oponentPokemon, Attack attack) {
        double effectivity;
        switch (oponentPokemon.getType()){
            case WATER -> effectivity = 0.5;
            case ROCK -> effectivity = 0.5;
            case FIRE -> effectivity = 0.5;
            case PLANT -> effectivity = 2.0;
            default -> effectivity = 1.0;
        }
        oponentPokemon.receiveDamage((attack.getAttackPower() - oponentPokemon.getDefense())*effectivity);
    }
}
