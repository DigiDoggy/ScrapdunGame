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
public class Player {
    public static Scanner scanner = new Scanner(System.in);
    int playerHp;


    public static ArrayList<String> playerName(){
        ArrayList<String> player = new ArrayList<>();
        System.out.println("Hello new hero of that danger word.");
        System.out.println("Enter your name: ");
        String pName = scanner.nextLine();
        player.add(pName);
        System.out.println("Where are u from " + pName);
        String place = scanner.nextLine();
        player.add(place);

        return player;
    }
}
