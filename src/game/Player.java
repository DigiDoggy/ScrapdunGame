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


    //Random Method
    public static int Random(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }


}
