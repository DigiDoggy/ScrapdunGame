package game;


import java.util.Scanner;

/*
TODO:
 1.First menu
 2.Fight method ( mb going to other new class)
 3. Think about the dependencies of classes on each other and perhaps use an abstract class. (for heroes and items)
 */
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        greetings();
//        Player.playerName();
//        NpcOption();


    }

    //Actions with NPCs with input validation
    public static void NpcOption() {
        int choice;

        System.out.println("""
                1.To talk to a warrior\s
                2.Get into a fight\s
                3.Leave the warrior\s
                Make your choice:""");

        do {

            choice = scanner.nextInt();

            if ((choice < 1) || (choice > 3)) {
                System.out.println("There is no such option.");
            }

        } while ((choice < 1) || (choice > 3));


        switch (choice) {
            case 1:
                Npc.npcStory();
                //method for Talk
                break;
            case 2:
                //Method for fight
                break;
            case 3:
                break;
        }

    }

    // Game greetings with delay
    public static void greetings() {
        String hello = "Добро пожаловать в игру. Бл*!!!";
        String welcome = "Welcome to the game.";
        String tab = "\t";
//tab for writing text in the centre
        for (int i = 10; i>=0;i--){
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
        for (int i = 0; i < welcome.length();i++){
            loading(200);
            System.out.print(welcome.charAt(i));
        }
        System.out.println();
    }
    // Delay
    public static void loading(int delay){

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
