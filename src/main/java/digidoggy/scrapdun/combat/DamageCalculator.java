package digidoggy.scrapdun.combat;

import digidoggy.scrapdun.combat.combat_Strategy.BodyPart;

import java.util.Random;

public class DamageCalculator {
    private Random random = new Random();

    public int calculateDamage(int damage, int defense, BodyPart target) {
        double bodyPartMultiplier = getBodyPartMultiplier(target);
        double defenceMultiplier = getDefenceMultiplier(defense);

        int baseDamage = (int) (damage * defenceMultiplier * bodyPartMultiplier);

        return baseDamage + random.nextInt(7) - 1;
    }

    private double getDefenceMultiplier(int defense) {
        if (defense > 200) return 0.5;
        else if (defense > 150) return 0.6;
        else return 0.7;
    }

    private double getBodyPartMultiplier(BodyPart target) {
        switch (target) {
            case HEAD:
                return 1.0;
            case TORSO:
                return 0.9;
            case ARMS:
            case LEGS:
                return 0.75;
            default:
                throw new IllegalArgumentException("Unknown body part: " + target);
        }
    }


}
