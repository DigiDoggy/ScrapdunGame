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



    public static void equipment(){
        ArrayList<Object> lonelyScaled = new ArrayList<>();
        Armor armor = new Armor("Lonely Scaled ChestGuard",150,"Heavy");
        Armor armor1 = new Armor("Lonely Scaled Legs",40,"Heavy");
        Armor armor2 = new Armor("Lonely Scaled Gloves",25,"Heavy");
        Armor armor3 = new Armor("Lonely Scaled Helmet",35,"Heavy");


        lonelyScaled.add("Set of Lonely Scaled - Heavy armor");
        lonelyScaled.add(armor);
        lonelyScaled.add(armor1);
        lonelyScaled.add(armor2);
        lonelyScaled.add(armor3);
        for (int i = 0; i < lonelyScaled.size();i++){
            System.out.println(lonelyScaled.get(i));

        }


        Armor armor4 = new Armor("Shadow Cloth Wraps", 70,"Light");
        Armor armor5 = new Armor("Shadow Cloth Hat", 20,"Light");
        Armor armor6 = new Armor("Shadow Cloth Gloves", 12,"Light");
        Armor armor7 = new Armor("Shadow Cloth Boots", 10,"Light");


    }
    //Random Method
    public static int Random(int number){
        Random random = new Random();
        return random.nextInt(number);
    }


}
