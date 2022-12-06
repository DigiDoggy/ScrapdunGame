package digidoggy.scrapdun;

import digidoggy.scrapdun.combat.Fight;
import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        greetings();
        Player.createName();
        action1();

    }

    public static void action1() {

        System.out.println("1.Examine the corpses.");
        System.out.println("2.Go check out the tent.");
        System.out.println("3.Go fight!");
        System.out.println("4.Database of the game");
        System.out.println("5.It's time to finish the game!");


        int choice = Main.choiceFromTo(1, 5);


        switch (choice) {
            case 1:
                Npc.npcChoice();
                Armor.chooseArmor();

                break;
            case 2:
                System.out.println("You went inside the tent and saw a note.");
                System.out.println("And remember the password to let go. \n" + "JavaEE18");
                System.out.println();
                action1();
                break;
            case 3:
                Fight.fightMethod();
                action1();
                break;
            case 4:
                System.out.println("Maybe there will be a database"+"\n");
                action1();
                break;
            case 5:
                //leave the game
                break;
        }
    }



    // Game greetings with delay
    public static void greetings() {
        String hello = "Добро пожаловать в игру.";
        String welcome = "Welcome to the game.";
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
                System.out.printf("%s - is not an integer.%n", scanner.next());
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
