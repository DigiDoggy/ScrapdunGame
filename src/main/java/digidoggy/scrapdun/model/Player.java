package digidoggy.scrapdun.model;

import digidoggy.scrapdun.Armor;
import digidoggy.scrapdun.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 TODO
  0.Begin story about player (prison, dungeon etc.)
  1. Player name  ( need for final result)
  2. Player hp
  3. Choice of ammunition based.
  4. Method of choice(Hit/Block)
 5.

 */
public class Player {


    protected static String characterName;
    protected static int health = 100;
    protected static String characterWeapon;
    protected static String armorsHead;
    protected static String armorBody;
    protected static String armorLegs;
    protected static String armorArms;
    public static int damage = 10;
    //    protected static int crtDamage = 5;
//    protected static String block;
    public static int defence = 10;


    public Player(String characterName, int health, int damage, int defence) {
        Player.characterName = characterName;
        Player.health = health;
        Player.damage = damage;
        Player.defence = defence;

        System.out.println("characterName: " + characterName + "\n" +
                "health: " + health + "\n" +
                "damage: " + damage + "\n" +
                "defence: " + defence);
    }

    Player player = new Player(characterName, health, damage, defence);
    public static Scanner scanner = new Scanner(System.in);

    public static List<Armor> playerArmor = new ArrayList<>();


//    characterName


    // find out the name of the player
    public static String createName() {

        System.out.println("Hello new hero of that danger word.");
        System.out.println("Enter your name: ");
        characterName = scanner.nextLine();
        System.out.println(characterName + "you see many corpses after the battle, " + "\n" +
                "an empty military tent and a bush of berries growing next to you.");
        System.out.println("What will you do?");

        return characterName;
    }

    //method for user who find some item
    public static void action1() {

        System.out.println("1.Examine the corpses.");
        System.out.println("2.Go check out the tent.");
        System.out.println("3.Go fight");
        System.out.println("4.It's time to finish the game!");


        int choice = Main.validatesInputNumber();
        Main.choiceFromTo(choice, 1, 4);


        switch (choice) {
            case 1:
                Armor.chooseArmor();
                break;
            case 2:
                System.out.println("You went inside the tent and saw a note.");
                System.out.println("And remember the password to let go. \n" +
                        "JavaEE18");
                System.out.println();
                action1();
                break;
            case 3:
                System.out.println("Go to fight method");
                break;

            case 4:
                // leave method

                break;
        }
    }

    //calculate defence
    public static void calculateDefenceForPlayer(int defOfArmor) {
        Player.defence += defOfArmor;
    }

    //calculate damage

    public static void calculateWeaponDamage(int weaponDamage) {
        Player.damage += weaponDamage;
    }

    public void tent() {
        System.out.println("You go to t");
    }
//
//    //Random Method
//    public static int Random(int number) {
//        Random random = new Random();
//        return random.nextInt(number);
//    }
//

}
