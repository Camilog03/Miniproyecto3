package src.pokemons;

import java.util.ArrayList;
import src.actions.Attack;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(ArrayList<Attack> attacks, int hp, Type tipo, String name) {
        super(attacks, hp, tipo, name);
    }

    @Override
    public int doAttack(Attack attack) {

        return 0;
    }
}
