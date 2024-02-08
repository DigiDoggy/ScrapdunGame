package digidoggy.scrapdun;

import digidoggy.scrapdun.Game.Game;
import digidoggy.scrapdun.model.User;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        Game game = new Game();
        User user = game.startGame();
        game.startMenu(user);

    }
}
