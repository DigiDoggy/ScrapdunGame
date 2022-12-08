package digidoggy.scrapdun;


import digidoggy.scrapdun.model.Player;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Weapon extends Equipment {

    public Weapon(String nameOfWeapon, String typeOfWeapon, int dmg, int crtCh) {
        super(nameOfWeapon, typeOfWeapon, dmg, crtCh);
    }


    protected static Weapon axe = new Weapon("Axe of Infinity", "Axe", 30, 14);
    protected static Weapon sword = new Weapon("Sword of Destiny", "Sword", 45, 18);
    protected static Weapon staffOfSoul = new Weapon("Staff of Soul", "Staff", 25, 8);
    protected static Weapon bow = new Weapon("Bow of Light", "Bow", 60, 20);
    protected static Weapon dagger = new Weapon("Knife of Blood", "Dagger", 24, 46);

    public static void choseWeapon()throws SQLException {
        System.out.println("While collecting the set, you saw the weapon that you would like to receive.");

        System.out.println("1. " + axe.nameOfWeapon);
        System.out.println("2. " + bow.nameOfWeapon);
        System.out.println("3. " + dagger.nameOfWeapon);
        System.out.println("4. " + sword.nameOfWeapon);
        System.out.println("5. " + staffOfSoul.nameOfWeapon);

        System.out.println("Which weapon you need ?");
        int select = Main.choiceFromTo(1, 5);

        switch (select) {
            case 1:
                //Player damage
                Player.calculateWeaponDamage(damageFromWeapon(select));
                Player.setCharacterWeapon(axe.nameOfWeapon);
                System.out.println("You have " + axe.nameOfWeapon + "\n" + "Your damage now " + Player.damage);
                Main.loading(500);
                System.out.println();

                Main.action1();
                break;
            case 2:
                Player.calculateWeaponDamage(damageFromWeapon(select));
                System.out.println("You have " + bow.nameOfWeapon + "\n" + "Your damage now " + Player.damage);
                Player.setCharacterWeapon(bow.nameOfWeapon);
                Main.loading(500);
                System.out.println();

                Main.action1();
                break;
            case 3:
                Player.calculateWeaponDamage(damageFromWeapon(select));
                System.out.println("You have " + dagger.nameOfWeapon + "\n" + "Your damage now " + Player.damage);
                Player.setCharacterWeapon(dagger.nameOfWeapon);
                Main.loading(500);
                System.out.println();

                Main.action1();
                break;
            case 4:
                Player.calculateWeaponDamage(damageFromWeapon(select));
                System.out.println("You have " + sword.nameOfWeapon + "\n" + "Your damage now " + Player.damage);
                Player.setCharacterWeapon(sword.nameOfWeapon);
                Main.loading(500);
                System.out.println();

                Main.action1();
                break;
            case 5:
                Player.calculateWeaponDamage(damageFromWeapon(select));
                System.out.println("You have " + staffOfSoul.nameOfWeapon + "\n" + "Your damage now " + Player.damage);
                Player.setCharacterWeapon(staffOfSoul.nameOfWeapon);
                Main.loading(500);
                System.out.println();

                Main.action1();

                break;

        }


    }

    public static int damageFromWeapon(int select) {
        List<Equipment> weaponList = new ArrayList<>();
        weaponList.add(axe);
        weaponList.add(bow);
        weaponList.add(dagger);
        weaponList.add(sword);
        weaponList.add(staffOfSoul);

        return weaponList.get(select-1).dmg;
    }


}
