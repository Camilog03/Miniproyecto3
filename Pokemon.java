import java.util.ArrayList;

public class Pokemon {
    private String name;
    private Type type;
    private int hp;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();


    public Pokemon(ArrayList<Attack> attacks, int hp, Type type, String name) {
        this.attacks = attacks;
        this.hp = hp;
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks;
    }

    public int doAttack(Attack attack){
        //Return the potence of the attack
        return 0;
    }

    public void receiveDamage(int damage){
        hp -= damage;
    }



}
