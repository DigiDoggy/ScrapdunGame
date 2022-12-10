package digidoggy.scrapdun;

import digidoggy.scrapdun.color.Color;
import digidoggy.scrapdun.combat.Fight;
import digidoggy.scrapdun.dataBase.Data;
import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws SQLException {

        // todo ALL COMPLETED
        greetings();
        Player.createName();
        action1();


    }

    public static void action1()throws SQLException {

        System.out.println( "1.Examine the corpses.");
        System.out.println("2.Go check out the tent.");
        System.out.println("3.Go fight!");
        System.out.println("4.Database of the game");
        System.out.println("5.It's time to finish the game!");


        int choice = Main.choiceFromTo(1, 5);


        switch (choice){
            case 1:
                if (Player.getDefence()>1 && Player.getDamage()>10){
                    Player.setDefence(1);
                    Player.setDamage(10);
                }
                Npc.npcChoice();
                Armor.chooseArmor();

                break;
            case 2:
                Player.getToTheTent();
                System.out.println();

                action1();
                break;
            case 3:
                Fight.fightMethod();
                action1();
                break;
            case 4:

                Data.dataOptions();
                action1();
                break;
            case 5:
                //leave the game
                break;
        }
    }



    // Game greetings with delay
    public static void greetings() {
        String hello = Color.ANSI_PURPLE+" Laipni lūdzam spēlē!"+Color.ANSI_RESET;
        String welcome = Color.ANSI_CYAN+"Welcome to the game."+Color.ANSI_RESET;
        String tab = "\t";
//tab for writing text in the centre
        for (int i = 10; i >= 0; i--) {
            System.out.print(tab);
        }
        // for little joke
        for (int i = 0; i < hello.length(); i++) {
            loading(150);

            System.out.print(hello.charAt(i));
        }
        for (int i = 0; i < hello.length(); i++) {
            loading(50);
            System.out.print("\b");
        }
// greetings text
        for (int i = 0; i < welcome.length(); i++) {
            loading(200);
            System.out.print(welcome.charAt(i));
        }
        System.out.println();
    }

    // Delay
    public static void loading(int delay) {

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int choiceFromTo( int number, int num){
        int choice;
        do {
            choice = validatesInputNumber();
            if ((choice < number) || (choice > num)) {
                System.out.println("There is no such option.");

            }
        }while ((choice < number) || (choice > num));

        return choice;
        }


    //checks input for a number
    public static int validatesInputNumber() {
        int numb;
        int number = 0;
        do {
            numb = 0;
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                System.out.printf(Color.ANSI_WHITE+"%s - is not an integer.%n"+Color.ANSI_RESET, scanner.next());
                numb = 1;
            }
        } while (numb == 1);

        return number;
    }


        //Random Method
    public static int Random(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

}
