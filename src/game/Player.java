package game;

import java.util.ArrayList;
import java.util.Random;
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
public class Player extends AbstractPlayers {
    public static Scanner scanner = new Scanner(System.in);
    private static String playerName;

    // find out the name of the player
    public static String createName() {

        System.out.println("Hello new hero of that danger word.");
        System.out.println("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println(playerName + "All around you you see the battlefield and many corpses.\n" +
                "You understand, you can pick up a Equipment.");

        return playerName;
    }


    public static void equipment() {

        Armor armor = new Armor("Lonely Scaled ChestGuard", 150, "Heavy");
        Armor armor1 = new Armor("Lonely Scaled Legs", 40, "Heavy");
        Armor armor2 = new Armor("Lonely Scaled Gloves", 25, "Heavy");
        Armor armor3 = new Armor("Lonely Scaled Helmet", 35, "Heavy");

        ArrayList<Object> lonelyScaled = new ArrayList<>();
        lonelyScaled.add(armor);
        lonelyScaled.add(armor1);
        lonelyScaled.add(armor2);
        lonelyScaled.add(armor3);

        //Loop only for test
        for (int i = 0; i < lonelyScaled.size(); i++) {
            if (i%4 == 0 || i == 0) {
                System.out.println(lonelyScaled.get(i));
            }
        }


        Armor armor4 = new Armor("Shadow Cloth Wraps", 70, "Light");
        Armor armor5 = new Armor("Shadow Cloth Hat", 20, "Light");
        Armor armor6 = new Armor("Shadow Cloth Gloves", 12, "Light");
        Armor armor7 = new Armor("Shadow Cloth Boots", 10, "Light");

        ArrayList<Armor> shadow = new ArrayList<>();
        shadow.add(armor4);
        shadow.add(armor5);
        shadow.add(armor6);
        shadow.add(armor7);


        Armor armor8 = new Armor("Major Arcana Robe", 50, "Cotton");
        Armor armor9 = new Armor("Major Arcana Circlet", 50, "Cotton");
        Armor armor10 = new Armor("Major Arcana Gloves", 50, "Cotton");
        Armor armor11 = new Armor("Major Arcana Boots", 50, "Cotton");

        ArrayList<Armor> major = new ArrayList<>();
        major.add(armor8);
        major.add(armor9);
        major.add(armor10);
        major.add(armor11);


    }

    //Random Method
    public static int Random(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }


}
