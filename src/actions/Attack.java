package src.actions;

import src.pokemons.Type;

public class Attack {
    private final String name;
    private final Type typeOfDamage;
    private final double attackPower;


    public Attack(String name, Type typeOfDamage, double attackPower) {
        this.name = name;
        this.typeOfDamage = typeOfDamage;
        this.attackPower = attackPower;
    }


    public String getName() {
        return name;
    }

    public Type getTypeOfDamage() {
        return typeOfDamage;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public String toString() {return name + " ,Tipo:" + typeOfDamage + ", Portencia: " + attackPower;}

    
}



