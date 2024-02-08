package digidoggy.scrapdun.combat;

import digidoggy.scrapdun.combat.combat_Observer.CombatListener;
import digidoggy.scrapdun.combat.combat_Strategy.BodyPart;
import digidoggy.scrapdun.combat.combat_Strategy.CombatStrategy;
import digidoggy.scrapdun.common.NumberChooser;
import digidoggy.scrapdun.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CombatMechanics {
    private Map<Integer, BodyPart> bodyParts;
    private List<CombatListener> listeners = new ArrayList<>();
    private NumberChooser playerChooser;
    private NumberChooser npcChooser;
    private CombatStrategy combatActionStrategy;
    private Player player;
    private HealthDisplay healthDisplay = new HealthDisplay();

    public CombatMechanics(Player player, NumberChooser playerChooser, NumberChooser npcChooser) {
        this.player = player;
        this.playerChooser = playerChooser;
        this.npcChooser = npcChooser;
        this.bodyParts = new HashMap<>() {{
            put(1, BodyPart.HEAD);
            put(2, BodyPart.TORSO);
            put(3, BodyPart.ARMS);
            put(4, BodyPart.LEGS);
        }};

    }

    private void notifyAttack(String attacker, String defender, int damage) {
        for (CombatListener listener : listeners) {
            listener.onAttack(attacker, defender, damage);
        }
    }

    private void notifyDefend(String defender, String Attacker) {
        for (CombatListener listener : listeners) {
            listener.onBlock(defender, Attacker);
        }
    }

    private void notifyHealthChange(String characterName, int newHealth) {
        System.out.println(characterName + " now has health: " + newHealth);
        String healthBar = healthDisplay.getHealthBar(newHealth);
        System.out.println(healthBar);
    }

    public void addListeners(CombatListener listener) {
        listeners.add(listener);
    }

    public void removeListener(CombatListener listener) {
        listeners.remove(listener);
    }

    public void executeCombatRound(Player player1, Player player2, NumberChooser chooserPlayer1, NumberChooser chooserPlayer2) {
        BodyPart attackTargetPlayer1 = bodyParts.get(chooserPlayer1.chooseNumberFromTo(1, bodyParts.size()));
        BodyPart defendTargetPlayer1 = bodyParts.get(chooserPlayer1.chooseNumberFromTo(1, bodyParts.size()));

        BodyPart attackTargetPlayer2 = bodyParts.get(chooserPlayer2.chooseNumberFromTo(1, bodyParts.size()));
        BodyPart defendTargetPlayer2 = bodyParts.get(chooserPlayer2.chooseNumberFromTo(1, bodyParts.size()));

        performAttackAndDefense(player1, player2, attackTargetPlayer1, defendTargetPlayer2);
        performAttackAndDefense(player2, player1, attackTargetPlayer2, defendTargetPlayer1);
    }

    private void performAttackAndDefense(Player attacker, Player defender, BodyPart attackTarget, BodyPart defendTarget) {
        DamageCalculator damageCalculator = new DamageCalculator();

        boolean isAttackBlocked = attackTarget == defendTarget;
        if (!isAttackBlocked) {

            int damage = damageCalculator.calculateDamage(attacker.getDamage(), defender.getDefense(), attackTarget);
            defender.setHealth(defender.getHealth() - damage);
            notifyAttack(attacker.getName(), defender.getName(), damage);
            notifyHealthChange(defender.getName(), defender.getHealth());
        } else {
            notifyDefend(defender.getName(), attacker.getName());
        }
    }


}
