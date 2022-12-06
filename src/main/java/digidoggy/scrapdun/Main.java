package digidoggy.scrapdun;

import digidoggy.scrapdun.model.Player;

import java.util.Random;
import java.util.Scanner;


public class Main {

    private static String winnerName = " ";

    public static void setWinnerName(String winnerName) {
        Main.winnerName = winnerName;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        greetings();
        Player.createName();
        Player.action1();


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
