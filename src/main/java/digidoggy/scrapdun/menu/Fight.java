package digidoggy.scrapdun.menu;

import digidoggy.scrapdun.combat.CombatMechanics;
import digidoggy.scrapdun.common.NumberChooser;
import digidoggy.scrapdun.common.RandomNumberGeneratorImpl;
import digidoggy.scrapdun.common.UserInputChooser;
import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;
import digidoggy.scrapdun.model.User;


public class Fight implements MenuAction {
    private User player;
    private Player npc;
    private NumberChooser playerChooser;
    private NumberChooser npcChooser;
    private CombatMechanics combatMechanics;

    public Fight(Player player) {
        this.player = (User) player;
        this.npc = new Npc("Enemy", 100, 10, 10);
        this.playerChooser = new UserInputChooser();
        this.npcChooser = new RandomNumberGeneratorImpl();
        this.combatMechanics = new CombatMechanics(player, playerChooser, npcChooser);
    }

    @Override
    public void execute() {

        System.out.println("The fight begins!");

        while (player.getHealth() > 0 && npc.getHealth() > 0) {
            System.out.println("\nNew round starts!");

            combatMechanics.executeCombatRound(player, npc, playerChooser, npcChooser);

            System.out.println(player.getName() + " Health: " + player.getHealth());
            System.out.println(npc.getName() + " Health: " + npc.getHealth());

            if (player.getHealth() <= 0) {
                System.out.println("You lose...");
                break;
            } else if (npc.getHealth() <= 0) {
                System.out.println("You win!");
                break;
            }
        }

        System.out.println("The fight is over.");
    }
}


