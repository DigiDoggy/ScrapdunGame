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
        System.out.println(playerName + "you see many corpses after the battle, "+"\n" +
                "an empty military tent and a bush of berries growing next to you.");
        System.out.println("What will you do?");

        return playerName;
    }
    //method for user who find some item
    public static void action1(){


        char choice  = (char) scanner.nextInt();


        switch (choice){
            case 1:
                //some method
                System.out.println("Examine the corpses");
                break;
            case 2:
                //some method
                System.out.println("Go check out the tent.");
                break;
            case 3:
                //some method
                System.out.println("Eat a berry");
                break;
            default:
                // leave method
                System.out.println("It's time to finish the game!");
        }


    }


    //Random Method
    public static int Random(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }


}
