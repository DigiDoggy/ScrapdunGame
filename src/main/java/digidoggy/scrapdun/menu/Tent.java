package digidoggy.scrapdun.menu;

import digidoggy.scrapdun.common.UserInputChooser;
import digidoggy.scrapdun.consol.ConsoleOutput;
import digidoggy.scrapdun.model.Player;

public class Tent implements MenuAction {

    private Player player;
    private UserInputChooser userInputChooser;
    private ConsoleOutput consoleOutput;

    public Tent(Player player) {
        this.player = player;
        this.userInputChooser = new UserInputChooser();
        this.consoleOutput = new ConsoleOutput();
    }

    @Override
    public void execute() {

        if (player.isPotion()) {
            consoleOutput.displayOutput("You've already explored everything here.");
        } else {
            consoleOutput.displayOutput("On the table, you saw a bottle of potion, on which it was written \n" +
                    "-\"Use if you want to heal\"");

            player.setPotion(userInputChooser.chooseChar());
            if (player.isPotion()) {
                consoleOutput.displayOutput("You took the bottle. \n");
            } else {
                consoleOutput.displayOutput("You refused the potion and left the tent. \n");
            }
        }

    }

}
