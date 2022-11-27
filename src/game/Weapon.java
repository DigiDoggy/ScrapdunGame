package game;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
                Player.player.characterWeapon = axe.nameOfWeapon;
                System.out.println("Great, you chose the mace." + Player.player.characterWeapon);
                Player.action1();
                break;
            case 2:
                Player.player.characterWeapon = bow.nameOfWeapon;
                System.out.println("Great, you chose the bow." + Player.player.characterWeapon);
                break;
            case 3:
                Player.player.characterWeapon = dagger.nameOfWeapon;
                System.out.println("Great, you chose the dagger." + Player.player.characterWeapon);
                break;
            case 4:
                Player.player.characterWeapon = sword.nameOfWeapon;
                System.out.println("Great, you chose the sword." + Player.player.characterWeapon);
                break;
            case 5:
                Player.player.characterWeapon = sword.nameOfWeapon;
                System.out.println("Great, you chose the staff" + Player.player.characterWeapon);
                break;
            default:
                break;
        }
    }

    public static List<Object> createWeaponsList(){
        List<Object> weaponList = new ArrayList<>();
        weaponList.add(Weapon.axe);
        weaponList.add(Weapon.bow);
        weaponList.add(Weapon.dagger);
        weaponList.add(Weapon.sword);
        weaponList.add(Weapon.staffOfSoul);
        return weaponList;
    }
//    public static void weaponDamage(){
//        if (Player.player.characterWeapon.equals(createWeaponsList().){
//            Player.player.damage = Weapon.axe.dmg;
//        }
//
//    }
}
