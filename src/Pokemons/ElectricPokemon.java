package src.Pokemons;

import java.util.ArrayList;


import Pokemons.Type;
import src.Actions.Attack;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(ArrayList<Attack> attacks, int hp, Type tipo, String name) {
        super(attacks, hp, tipo, name);
    }

    @Override
    public int doAttack(Attack attack) {
        return 0;
    }
}
