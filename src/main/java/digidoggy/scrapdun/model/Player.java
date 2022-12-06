package digidoggy.scrapdun.model;

import digidoggy.scrapdun.Armor;
import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.combat.Fight;

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
    //    protected static String characterWeapon;
    public static int damage = 10;
    public static int defence = 1;

    public static ArrayList<String> playerBlockHit = new ArrayList<>();

    //Setter

    public static void setHealth(int health) {
        Player.health = health;
    }

    //Getters
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

    public static Scanner scanner = new Scanner(System.in);

    public static List<Armor> playerArmor = new ArrayList<>();


    // find out the name of the player
    public static void createName() {

        System.out.println("Hello new hero.");
        System.out.println("Enter your name: ");
        characterName = scanner.nextLine().trim();


    }

    //method for user who find some item


    //calculate defence
    public static void calculateDefenceForPlayer(int defOfArmor) {
        Player.defence += defOfArmor;
    }

    //calculate damage

    public static void calculateWeaponDamage(int weaponDamage) {
        Player.damage += weaponDamage;
    }


}
