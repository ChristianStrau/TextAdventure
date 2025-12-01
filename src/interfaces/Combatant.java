package interfaces;

public interface Combatant {
    String attack(Combatant target);
    void takeDamage(int damage);
    int getHealth();
    int getAttackPower();
    boolean isAlive();
}
