package digidoggy.scrapdun.common;

import digidoggy.scrapdun.consol.ConsoleOutput;

import java.util.Scanner;

public class UserInputChooser implements NumberChooser, CharChooser {
    private ConsoleOutput consoleOutput;
    private Scanner scanner = new Scanner(System.in);
    ;

    public UserInputChooser() {
        consoleOutput = new ConsoleOutput();
    }

    public int chooseNumberFromTo(int min, int max) {
        int number;

        do {
            consoleOutput.displayOutput(MessageUtils.chooseYourNumber(min, max));
            while (!scanner.hasNextInt()) {
                consoleOutput.errorOutput("Please enter a valid integer.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < min || number > max);
        return number;
    }

    public boolean chooseChar() {
        String choice;
        do {
            consoleOutput.displayOutput("Please choose 'y' or 'n': ");
            choice = scanner.next();

            if (choice.length() == 1 && (choice.charAt(0) == 'y' || choice.charAt(0) == 'n')) {
                return choice.charAt(0) == 'y';
            } else {
                consoleOutput.errorOutput("Invalid input. Please enter 'y' or 'n'.");
            }
        } while (true);
    }

}
