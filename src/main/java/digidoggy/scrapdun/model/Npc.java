package digidoggy.scrapdun.model;

import digidoggy.scrapdun.model.Characters;

import java.util.Scanner;

/*
todo
 1. Create story
 2.Create fight system (random hit and random block)
 3. Choice of ammunition based on random.
 */
public class Npc extends Characters {

    public Npc(int health, int damage, int crtDamage, int defence) {
        super(health, damage, crtDamage, defence);
    }

    private static Scanner scanner = new Scanner(System.in);
   private static String npcName = " ";

    // Story of NPC life/ going to main menu
public static void npcStory(){
    System.out.println("Story of my life");
}

public static void fight(){
    System.out.println(npcName+" Says :" + "\n" +
            "I'm glad you want a fight. And the power (Indicate God) will help me.\n" +
            "But first, tell me your name!");
    System.out.println("Do you want to give your name? y/n");

    char choice = ' ';
    do{

        choice = scanner.next().charAt(0);
        if ((choice!='y') && (choice!= 'n')){
            System.out.println("Select y or n:");
        }
    }while ((choice!='y') && (choice!= 'n') );








}



}
