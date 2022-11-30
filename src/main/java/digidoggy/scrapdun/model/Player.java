package digidoggy.scrapdun.model;

import digidoggy.scrapdun.Armor;
import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.model.Characters;

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

    public Player(String characterName, int health, String characterWeapon, int damage, int crtDamage, String block, int defence) {
        super(health, damage, crtDamage, defence);
    }
    public Player(String armorsHead, String armorBody, String armorLegs, String armorArms) {
        super(armorsHead, armorBody, armorLegs, armorArms);
    }


    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> playerArmor = new ArrayList<>();


     protected static Player player = new Player(characterName, health,characterWeapon ,damage ,crtDamage,block,defence );


//    characterName


    // find out the name of the player
    public static String createName() {

        System.out.println("Hello new hero of that danger word.");
        System.out.println("Enter your name: ");
        characterName = scanner.nextLine();
        System.out.println(characterName + "you see many corpses after the battle, "+"\n" +
                "an empty military tent and a bush of berries growing next to you.");
        System.out.println("What will you do?");

        return characterName;
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
