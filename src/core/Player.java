package core;

import interfaces.Combatant;
import model.Item;
import model.Room;

import java.util.List;

public class Player implements Combatant {
    private String name;
    private int health, maxHealth;
    private int attackPower;
    private int defense;
    private List<Item> inventory;
    private Room currentRoom;

    //Kampf Methoden:
    @Override
    public String attack(Combatant target) {
        return "";
    }

    @Override
    public void takeDamage(int damage) {

    }
    //Helfer Methoden
    public void heal(int amount){}
    public void increaseAttack(int amount){}
    public void increaseDefense(int amount){}

    //Inventar Methodem
    public void addItem(Item item){}
    public void findItem(String name){}

    //Info Methoden
    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getAttackPower() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
