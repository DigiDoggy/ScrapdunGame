package digidoggy.scrapdun.Game;

import digidoggy.scrapdun.consol.ConsoleOutput;
import digidoggy.scrapdun.menu.GameMenu;
import digidoggy.scrapdun.model.User;


public class Game {
    private User user;
    private GameMenu gameMenu;
    private ConsoleOutput consoleOutput;

    public Game() {
        this.consoleOutput = new ConsoleOutput();
    }

    public User startGame() {
        User user = new User("Non", 100, 0, 0, false);
        user.createName();
        this.gameMenu = new GameMenu(user);
        return user;
    }

    public void startMenu(User user) {
        gameMenu.displayMenu();
    }


}
