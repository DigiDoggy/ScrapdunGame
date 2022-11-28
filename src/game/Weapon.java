package game;


import java.util.ArrayList;
import java.util.List;

import static game.Characters.characterWeapon;
import static game.Player.player;


public class Weapon extends Equipment {

    public Weapon(String nameOfWeapon, String typeOfWeapon, int dmg, int crtCh) {
        super(nameOfWeapon, typeOfWeapon, dmg, crtCh);
    }


   public static void some(){


   }



    protected static Weapon axe = new Weapon("Axe of Infinity", "Axe", 30, 14);
    protected static Weapon sword = new Weapon("Sword of Destiny", "Sword", 45, 18);
    protected static  Weapon staffOfSoul = new Weapon("Staff of Soul", "Staff", 25, 8);
    protected static  Weapon bow = new Weapon("Bow of Light", "Bow", 60, 20);
    protected static  Weapon dagger = new Weapon("Knife of Blood", "Dagger", 24, 46);

    public static void choseWeapon(){
        System.out.println("1. " + axe.nameOfWeapon);
        System.out.println("2. " + bow.nameOfWeapon);
        System.out.println("3. " + dagger.nameOfWeapon);
        System.out.println("4. " + sword.nameOfWeapon);
        System.out.println("5. " + staffOfSoul.nameOfWeapon);

        System.out.println("Which weapon you need ?");
        int choice = Main.validatesInputNumber();
        Main.choiceFromTo(choice,1,5);

        switch (choice){
            case 1:
                player.characterWeapon = axe.nameOfWeapon;
                System.out.println("Great, you chose the mace." + player.characterWeapon);
                Player.action1();
                break;
            case 2:
                player.characterWeapon = bow.nameOfWeapon;
                System.out.println("Great, you chose the bow." + player.characterWeapon);
                break;
            case 3:
                player.characterWeapon = dagger.nameOfWeapon;
                System.out.println("Great, you chose the dagger." + player.characterWeapon);
                break;
            case 4:
                player.characterWeapon = sword.nameOfWeapon;
                System.out.println("Great, you chose the sword." + player.characterWeapon);
                break;
            case 5:
                player.characterWeapon = sword.nameOfWeapon;
                System.out.println("Great, you chose the staff" + player.characterWeapon);
                break;
            default:
                break;
        }
    }

    public static List<Equipment> createWeaponsList(){
        List<Equipment> weaponList = new ArrayList<>();
        weaponList.add(axe);
        weaponList.add(bow);
        weaponList.add(dagger);
        weaponList.add(sword);
        weaponList.add(staffOfSoul);

        return weaponList;

    }


    public static void weaponDamage(){
        player.characterWeapon = "Bow of Light";

        for (Equipment weapon: createWeaponsList()) {
            if (weapon.nameOfWeapon.equalsIgnoreCase(player.characterWeapon)){
                player.damage += weapon.dmg;
                System.out.println(player.damage);
            }
        }


    }
}
