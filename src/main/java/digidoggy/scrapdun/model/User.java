package digidoggy.scrapdun.model;

import digidoggy.scrapdun.outFit.Armor;

import java.util.List;
import java.util.Scanner;

public class User extends Player {

    public User(String name, int health, int damage, int defence, boolean potion) {
        super(name, 100, damage, defence);
        this.potion = false;

    }

    private List<Armor> playerArmor;

    public List<Armor> getPlayerArmor() {
        return playerArmor;
    }

    public void setPlayerArmor(List<Armor> playerArmor) {
        this.playerArmor = playerArmor;
    }

    public void createName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name:");
        String userName = scanner.nextLine();
        this.setName(userName);
    }

}