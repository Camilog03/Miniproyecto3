package Pokemons;

import Actions.Attack;

import java.util.ArrayList;

public class PlantPokemon extends Pokemon {

    public PlantPokemon(ArrayList<Attack> attacks, int hp, Type type, String name) {
        super(attacks, hp, type, name);
    }

    @Override
    public int doAttack(Attack attack) {
        return 0;
    }
}
