package digidoggy.scrapdun.combat.combat_Strategy;

public class CombatAction implements CombatStrategy {
    private CombatStrategy actionType;

    public CombatAction(CombatStrategy actionType) {
        this.actionType = actionType;
    }

    public void performAction(BodyPart target) {
        System.out.println(actionType + " on " + target);
    }
}
