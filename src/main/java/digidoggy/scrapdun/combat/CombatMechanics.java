package digidoggy.scrapdun.combat;


import com.sun.source.tree.IfTree;
import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.color.Color;
import digidoggy.scrapdun.dataBase.Data;
import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;

import java.sql.SQLException;
import java.util.ArrayList;


public class CombatMechanics {

    public static int lose = 0;
    public static int win = 0;

    public static void setLose(int lose) {
        CombatMechanics.lose = lose;
    }

    public static void setWin(int win) {
        CombatMechanics.win = win;
    }

    public static boolean fightAction(String name, int hp, int dm, int def, boolean fight) throws SQLException {

        if (!fight) {
            return fight;
        } else {

            String name1;
            String name2;

            int damage = hit(dm, def);


            if (name.equals(Player.getCharacterName())) {
                // Player Attack
                System.out.println(Color.ANSI_CYAN+"Where do you attack?"+Color.ANSI_RESET);
                blockAndHitForPlayer(hp);
                //NpcBlock
                blockAndHitForNpc();
                //comparison - Player attack and NPC block
                if (Player.playerBlockHit.get(0).equals(Npc.npcBlockHit.get(0))) {

                    System.out.println("\n"+Color.ANSI_YELLOW+ "Attack blocked" + Color.ANSI_RESET+"\n");

                    Player.playerBlockHit.clear();
                    Npc.npcBlockHit.clear();
                    return fight;
                } else {
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
                System.out.println(Color.ANSI_CYAN+"What do you want to protect?" + Color.ANSI_RESET+ "\n");
                blockAndHitForPlayer(hp);
                //comparison - NPC attack and Player block
                if (Player.playerBlockHit.get(0).equals(Npc.npcBlockHit.get(0))) {
                    System.out.println("\n" + Color.ANSI_YELLOW+"Attack blocked" + Color.ANSI_RESET+"\n");


                    Player.playerBlockHit.clear();
                    Npc.npcBlockHit.clear();
                    return fight;
                } else {
                    hp -= damage;
                    Player.playerBlockHit.clear();
                    Npc.npcBlockHit.clear();
                }


                Player.setHealth(hp);
                name1 = (name);
                name2 = Player.getCharacterName();
            }

            System.out.println(Color.ANSI_RED+name1 + " Hit " + damage+Color.ANSI_RESET);

            if (hp > 0) {
                health(hp);
                System.out.println(Color.ANSI_GREEN+name2 + " health :" + hp+Color.ANSI_RESET);
            } else {
                hp = 0;
                System.out.println(Color.ANSI_RED+name2 + " died."+Color.ANSI_RESET);
                fight = false;


                System.out.println(Color.ANSI_CYAN+name1 + " Winner!" + "\n"+Color.ANSI_RESET);

                if (name1.equals(Player.getCharacterName())) {
                    win = 1;
                } else {
                    lose = 1;
                }

                Npc.setNpcHealth(100);
                Player.setHealth(100);

                Data.createGameTable();
                Data.insert();


                return fight;
            }

            return fight;
        }
    }

    public static int hit(int dm, int def) {
        int hit=0;
        if(def>200){
            hit=(dm*50)/100;
        }else if(def>150){
            hit=(dm*60)/100;
        }else{
            hit=(dm*70)/100;
        }

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

    public static int blockAndHitForPlayer(int hp) {
        int secondChoice=4;
        System.out.println("1.Head" + "\n" +
                "2.Body" + "\n" +
                "3.Hands" + "\n" +
                "4.Legs" + "\n");
        if (Player.isPotion() && hp<80){
            System.out.print(Color.ANSI_GREEN+"5.Drink the potion .\n"+Color.ANSI_RESET);
            secondChoice=5;

        }

        int choice = Main.choiceFromTo(1, secondChoice);


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
            case 5:
                if(Player.isPotion()){
                    takingThePotion(hp);
                    blockAndHitForPlayer(hp);
                }
                break;
        }
        return hp;
    }
    static void takingThePotion(int hp){
        hp+=(hp*20)/100;
        if (hp>100){
            hp=100;
        }

        System.out.println(Color.ANSI_GREEN+"You feel a little better. \n"+
                "Now your health: " +hp+Color.ANSI_RESET);
        Player.setPotion(false);
        System.out.println(Color.ANSI_YELLOW+"Your choice..."+Color.ANSI_RESET);
    }


    public static ArrayList partsForHitAndBlock() {
        ArrayList<String> partOfBody = new ArrayList<>();
        partOfBody.add("Head");
        partOfBody.add("Body");
        partOfBody.add("Hands");
        partOfBody.add("Legs");

        return partOfBody;
    }

    public static void health(int hp) {
// symbols for method
        char mark = '\u2605';
        char leftBracket = '\uFD3E';
        char rightBracket = '\uFD3F';
        String healthView = "";
//creating symbols for health view
        for (int i = 0; i < 10; i++) {
            healthView += mark;
        }

        //
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(90);
        arrayList.add(80);
        arrayList.add(70);
        arrayList.add(60);
        arrayList.add(50);
        arrayList.add(40);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(0);
        for (int number : arrayList) {
            if (hp == 0) {
                healthView = Color.ANSI_WHITE + "----- -\\/-\\/- /\\/\\/\\/" + Color.ANSI_RESET;
            } else if (number >= hp) {
                healthView += "\b";

            }
        }
        String finString = leftBracket + Color.ANSI_RED;
        finString += healthView + Color.ANSI_RESET + getStars(healthView, mark)+rightBracket;

        //difference between number of stars and backSpace
//        healthView = ;
//

        System.out.println(finString);

    }

    //difference between number of stars and backSpace
    static String getStars(String healthView, char mark) {


        int backSpaceInString = 0;
        for (int i = 0; i < healthView.length(); i++) {
            if (healthView.charAt(i) == '\b') {
                backSpaceInString += 1;
            }
        }

        String addingStars="";

        for (int i = 0; i <backSpaceInString; i++) {
            addingStars += mark;
        }


        return addingStars;
    }
}
