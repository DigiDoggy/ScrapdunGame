package digidoggy.scrapdun.model;

import digidoggy.scrapdun.Armor;
import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.color.Color;

import java.sql.SQLException;
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


    protected static String characterName = "Player";
    protected static int health = 100;
    private static String characterWeapon = "Fists";
    public static int damage = 10;
    public static int defence = 1;

    public static boolean potion = false;

    public static ArrayList<String> playerBlockHit = new ArrayList<>();

    //Setter


    public static void setPotion(boolean potion) {
        Player.potion = potion;
    }

    public static void setCharacterWeapon(String characterWeapon) {
        Player.characterWeapon = characterWeapon;
    }

    public static void setDamage(int damage) {
        Player.damage = damage;
    }

    public static void setDefence(int defence) {
        Player.defence = defence;
    }

    public static void setHealth(int health) {
        Player.health = health;
    }

    //Getters


    public static boolean isPotion() {
        return potion;
    }

    public static String getCharacterWeapon() {
        return characterWeapon;
    }

    public static String getCharacterName() {
        return characterName;
    }

    public static int getHealth() {
        return health;
    }


    public static int getDamage() {
        return damage;
    }


    public static int getDefence() {
        return defence;
    }


    public static Scanner scanner = new Scanner(System.in);

    public static List<Armor> playerArmor = new ArrayList<>();


    // find out the name of the player
    public static void createName() {

        System.out.println(Color.ANSI_WHITE + "Hello new hero.");
        System.out.println("Enter your name: " + Color.ANSI_RESET);
        characterName = scanner.nextLine().trim();


    }

    //calculate defence
    public static void calculateDefenceForPlayer(int defOfArmor) {
        Player.defence += defOfArmor;
    }

    //calculate damage

    public static void calculateWeaponDamage(int weaponDamage) {
        Player.damage += weaponDamage;
    }

    public static void getToTheTent() throws SQLException {
        if (Player.isPotion()) {
            System.out.println("You already have the potion.\n");
            Main.action1();
        }
        System.out.println("On the table, you saw a bottle of potion, on which it was written \n" +
                Color.ANSI_WHITE + "-\"Use if you want to heal\"" + "\n" + Color.ANSI_RESET);
        System.out.println( "Would you like to take a bottle? y/n" );
        char choice;
        choice = Main.scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            Player.setPotion(true);
            System.out.println(Color.ANSI_GREEN + "You took the bottle.\n" + Color.ANSI_RESET);
        } else if (choice == 'n' || choice == 'N') {
            System.out.println(Color.ANSI_WHITE + "You refused the potion and left the tent. \n" + Color.ANSI_RESET);
        }

        Main.action1();
    }


}
