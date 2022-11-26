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
public class Player extends Characters {

    public Player(int health, int damage, int crtDamage, int defence) {
        super(health, damage, crtDamage, defence);
    }

    public static Scanner scanner = new Scanner(System.in);
    private static String playerName;
    public static ArrayList<String> playerArmor = new ArrayList<>();

    public static ArrayList<String> playerWeapon = new ArrayList<>();



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

        System.out.println("1.Examine the corpses.");
        System.out.println("2.Go check out the tent.");
        System.out.println("3.Eat a berry");
        System.out.println("4.It's time to finish the game!");

        int choice  = Main.validatesInputNumber();

        Main.choiceFromTo(choice,1,4);



        switch (choice){
            case 1:
                Armor.choceArmor();
                break;
            case 2:
                System.out.println("You enter the tent and immediately pay attention to the chest.");
                System.out.println("You opened the chest and found:" + "\n" +
                        Armor.armorShadowBoots.nameOfArmor );

                break;
            case 3:
                //some method

                break;
            default:
                // leave method

                break;
        }


    }


    //подсчет защиты игрока.
//    public static int playerDefence(){
//
//        return playerDef;
//    }





    //Random Method
    public static int Random(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }


}
