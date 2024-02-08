package digidoggy.scrapdun.combat.combat_Observer;

public interface CombatListener {
    void onAttack(String attacker, String defender,int damage);
    void onBlock(String defender, String attacker);
    void onHealthChange(String Character, int newHealth);
}
