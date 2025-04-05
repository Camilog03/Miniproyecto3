package src.actions;

import src.pokemons.Type;

public class Attack {
    private String name;
    private Type typeOfDamage;
    private int attackPower;


    public Attack(String name, Type typeOfDamage, int attackPower) {
        this.name = name;
        this.typeOfDamage = typeOfDamage;
        this.attackPower = attackPower;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Type getTypeOfDamage() {
        return typeOfDamage;
    }


    public void setTypeOfDamage(Type typeOfDamage) {
        this.typeOfDamage = typeOfDamage;
    }


    public int getAttackPower() {
        return attackPower;
    }


    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
}



