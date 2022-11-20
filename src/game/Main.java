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

    NpcOption();


    }

    //Actions with NPCs with input validation
    public static void NpcOption(){
        int choice;

        System.out.println("""
                1.To talk to a warrior\s
                2.Get into a fight\s
                3.Leave the warrior\s
                Make your choice: """);

        do {

            choice= scanner.nextInt();

            if ((choice < 1) || (choice > 3)){
                System.out.println("There is no such option.");
            }

        }while ((choice < 1) || (choice > 3));


        switch (choice){
            case 1:
                System.out.println("hey");
                //method for Talk
                break;
            case 2:
                //Method for fight
                break;
            case 3:
                break;
        }

    }

}
