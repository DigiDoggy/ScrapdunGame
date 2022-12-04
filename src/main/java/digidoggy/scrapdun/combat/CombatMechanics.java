package digidoggy.scrapdun.combat;


import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;

import java.util.ArrayList;


public class CombatMechanics {

    public static boolean fightAction(String name, int hp, int dm, int def, boolean fight) {

        if (!fight) {
            return fight;
        } else {

            String name1;
            String name2;

            int damage = hit(dm, def);



            if (name.equals(Player.getCharacterName())) {
                // Player Attack
                System.out.println("Where do you attack?");
                blockAndHitForPlayer();
                //NpcBlock
                blockAndHitForNpc();
                //comparison - Player attack and NPC block
                if (Player.playerBlockHit.get(0).equals(Npc.npcBlockHit.get(0))){

                    System.out.println("\n"+"Attack blocked"+"\n");

                    Player.playerBlockHit.clear();
                    Npc.npcBlockHit.clear();
                    return fight;
                }else{
                    hp -= damage;
                    Player.playerBlockHit.clear();
                    Npc.npcBlockHit.clear();
                }

                Npc.setNpcHealth(hp);
                name1 = name;
                name2 = Npc.getNpcCharacterName();
            } else {
                //Npc attack
                blockAndHitForNpc();
                //Player Block
                System.out.println("What do you want to protect?"+"\n");
                blockAndHitForPlayer();
                //comparison - NPC attack and Player block
                if(Player.playerBlockHit.get(0).equals(Npc.npcBlockHit.get(0))){
                    System.out.println("\n"+"Attack blocked"+"\n");


                    Player.playerBlockHit.clear();
                    Npc.npcBlockHit.clear();
                    return fight;
                }else{
                    hp -= damage;
                    Player.playerBlockHit.clear();
                    Npc.npcBlockHit.clear();
                }


                Player.setHealth(hp);
                name1 = (name);
                name2 = Player.getCharacterName();
            }

            System.out.println(name1 + " Hit " + damage);

            if (hp > 0) {
                System.out.println(name2 + " health :" + hp);
            } else {
                hp = 0;
                System.out.println(name2 + " died.");
                fight = false;


                System.out.println(name1 + " Winner!" + "\n");

                if (name1.equals(Player.getCharacterName())) {
                    Main.setWinnerName(Player.getCharacterName());
                }


                return fight;
            }

            return fight;
        }
    }

    public static int hit(int dm, int def) {
        int hit = Math.round((dm/def)+15);
        int max = hit + 5;
        int min = hit - 1;
        hit = Main.Random((max - min) + 1);
        hit += min;
        return hit;
    }

    // Block and Het for NPC
    public static void blockAndHitForNpc() {
        int choice = Main.Random(4);

        switch (choice) {
            case 0:
                Npc.npcBlockHit.add((String) partsForHitAndBlock().get(0));
                break;
            case 1:
                Npc.npcBlockHit.add((String) partsForHitAndBlock().get(1));
                break;

            case 2:
                Npc.npcBlockHit.add((String) partsForHitAndBlock().get(2));
                break;
            case 3:
                Npc.npcBlockHit.add((String) partsForHitAndBlock().get(3));
                break;
        }

    }

    //Block and hit for Player

    public static void blockAndHitForPlayer() {
        System.out.println("1.Head" + "\n" +
                "2.Body" + "\n" +
                "3.Hands" + "\n" +
                "4.Legs" + "\n");

        int choice = Main.choiceFromTo(1, 4);


        switch (choice) {
            case 1:
                Player.playerBlockHit.add((String) partsForHitAndBlock().get(0));
                break;
            case 2:
                Player.playerBlockHit.add((String) partsForHitAndBlock().get(1));
                break;
            case 3:
                Player.playerBlockHit.add((String) partsForHitAndBlock().get(2));
                break;
            case 4:
                Player.playerBlockHit.add((String) partsForHitAndBlock().get(3));
                break;
        }
    }


    public static ArrayList partsForHitAndBlock() {
        ArrayList<String> partOfBody = new ArrayList<>();
        partOfBody.add("Head");
        partOfBody.add("Body");
        partOfBody.add("Hands");
        partOfBody.add("Legs");

        return partOfBody;
    }
}
