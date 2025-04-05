package src.pokemons;

import java.util.ArrayList;
import src.actions.Attack;

public class GroundPokemon extends Pokemon {

    public GroundPokemon(ArrayList<Attack> attacks, int hp, Type sss, String name) {
        super(attacks, hp, sss, name);
    }

    @Override
    public int doAttack(Attack attack) {
        return 0;
    }
}
