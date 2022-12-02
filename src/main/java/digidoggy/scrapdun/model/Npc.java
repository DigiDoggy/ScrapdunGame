package digidoggy.scrapdun.model;

import java.util.Scanner;

/*
todo
 1. Create story
 2.Create fight system (random hit and random block)
 3. Choice of ammunition based on random.
 */
public class Npc{

    protected static String npcCharacterName ;
    protected static int NpcHealth = 100;
    protected static String npcCharacterWeapon ;
//    protected static String armorsHead ;
//    protected static String armorBody ;
//    protected static String armorLegs ;
//    protected static String armorArms ;
    public static int npcDamage = 10;
    //    protected static int crtDamage = 5;
//    protected static String block;
    protected static int npcDefence = 10;

    public Npc(String npcCharacterName, int health, int damage, int defence){
        Npc.npcCharacterName =npcCharacterName;
        Npc.NpcHealth =health;
        Npc.npcDamage = damage;
        Npc.npcDefence = defence;

        System.out.println("characterName: " + npcCharacterName + "\n" +
                "health: " + NpcHealth + "\n" +
                "damage: " + npcDamage + "\n" +
                "defence: " + npcDefence);
    }

    private static Scanner scanner = new Scanner(System.in);
    private static String getNpcCharacterName = " ";

    // Story of NPC life/ going to main menu
    public static void npcStory() {
        System.out.println("Story of my life");
    }

    public static void fight() {
        System.out.println(npcCharacterName + " Says :" + "\n" +
                "I'm glad you want a fight. And the power (Indicate God) will help me.\n" +
                "But first, tell me your name!");
        System.out.println("Do you want to give your name? y/n");

        char choice = ' ';
        do {

            choice = scanner.next().charAt(0);
            if ((choice != 'y') && (choice != 'n')) {
                System.out.println("Select y or n:");
            }
        } while ((choice != 'y') && (choice != 'n'));
    }
}