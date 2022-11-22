package game;

import java.util.ArrayList;
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
public class Player extends AbstractPlayers{
    public static Scanner scanner = new Scanner(System.in);

// find out the name of the player
    public static String playerName(){

        System.out.println("Hello new hero of that danger word.");
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();


        return playerName;
    }
}
