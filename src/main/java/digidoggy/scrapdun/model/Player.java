package digidoggy.scrapdun.model;

import digidoggy.scrapdun.combat.combat_Strategy.CombatStrategy;
import digidoggy.scrapdun.consol.ConsoleOutput;
import digidoggy.scrapdun.outFit.Armor;
import digidoggy.scrapdun.weapens.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected boolean potion;
    protected ConsoleOutput consoleOutput;
    protected List<Armor> playerArmor;
    protected Weapon weapon;
    protected CombatStrategy combatActionStrategy;


    Player(String name, int health, int damage, int defense) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
        this.defense = defense;
        potion = false;
        this.consoleOutput = new ConsoleOutput();
        this.playerArmor = new ArrayList<>();
        this.weapon = new Weapon("First", 10, 1);

    }


    //Getters and setters

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        this.setDamage(weapon.getDamage());
    }

    public List<Armor> getPlayerArmor() {
        return playerArmor;
    }

    public void setPlayerArmor(List<Armor> playerArmor) {
        this.playerArmor = playerArmor;
    }

    public boolean isPotion() {
        return potion;
    }

    public void setPotion(boolean potion) {
        this.potion = potion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defence) {
        this.defense = defence;
    }

}