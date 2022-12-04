package digidoggy.scrapdun.combat;


import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;

public class Fight {

    public static void fightMethod() {


        boolean fight = true;

        while (fight) {

            fight=CombatMechanics.fightAction(Player.getCharacterName(), Npc.getNpcHealth(), Player.getDamage(), Npc.getNpcDefence(),fight);

            fight=CombatMechanics.fightAction(Npc.getNpcCharacterName(), Player.getHealth(), Npc.getNpcDamage(), Player.getDefence(),fight);

        }

    }


}




