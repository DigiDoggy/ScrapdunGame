package digidoggy.scrapdun.menu;

import digidoggy.scrapdun.consol.ConsoleOutput;
import digidoggy.scrapdun.model.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameMenu {

    private Scanner scanner;
    private Map<Integer, MenuAction> menuAction;
    private Player player;
    private ConsoleOutput consoleOutput;

    public GameMenu(Player player) {
        this.consoleOutput = new ConsoleOutput();
        scanner = new Scanner(System.in);
        menuAction = new HashMap<>();
        this.player = player;
        initializeMenu();
    }

    private void initializeMenu() {
        menuAction.put(1, new Corpse(player));
        menuAction.put(2, new Tent(player));
        menuAction.put(3, new Fight(player));
        menuAction.put(4, new GameDataBase());
    }

    public void displayMenu() {

        while (true) {
            System.out.println("Select an option: ");
            System.out.println("1. Examine the corpses.");
            System.out.println("2. Go check out the tent.");
            System.out.println("3. Go fight!");
            System.out.println("4. Database of the game");
            System.out.println("5. It's time to finish the game!");
            System.out.print("Enter your selection: " +
                    "\n");

            if (!scanner.hasNextInt()) {
                consoleOutput.errorOutput("Invalid input. Please enter a valid integer.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exit from the game.");
                break;
            }

            MenuAction action = menuAction.get(choice);
            if (action != null) {
                action.execute();
            } else {
                consoleOutput.errorOutput("Invalid selection. Please try again.");
            }
        }
    }
}
