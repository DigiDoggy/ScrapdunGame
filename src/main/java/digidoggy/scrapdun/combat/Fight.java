package digidoggy.scrapdun.combat;


import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;

public class Fight {

    public static void fightMethod() {
        //Player
//        Player.getCharacterName();
//        Player.getHealth();
//        Player.getDamage();
//        Player.getDefence();
//
        //NPC
//        Npc.getNpcCharacterName();
//        Npc.getNpcHealth();
//        Npc.getNpcDamage();
//        Npc.getNpcDefence();

        boolean fight = true;

        while (fight) {

            fight=CombatMechanics.hitDamage(Player.getCharacterName(), Npc.getNpcHealth(), Player.getDamage(), Npc.getNpcDefence(),fight);

            fight=CombatMechanics.hitDamage(Npc.getNpcCharacterName(), Player.getHealth(), Npc.getNpcDamage(), Player.getDefence(),fight);

        }

    }


}




