package digidoggy.scrapdun;


import java.util.ArrayList;
import java.util.List;


public class Weapon extends Equipment {

    public Weapon(String nameOfWeapon, String typeOfWeapon, int dmg, int crtCh) {
        super(nameOfWeapon, typeOfWeapon, dmg, crtCh);
    }


    public static void some() {


    }


    protected static Weapon axe = new Weapon("Axe of Infinity", "Axe", 30, 14);
    protected static Weapon sword = new Weapon("Sword of Destiny", "Sword", 45, 18);
    protected static Weapon staffOfSoul = new Weapon("Staff of Soul", "Staff", 25, 8);
    protected static Weapon bow = new Weapon("Bow of Light", "Bow", 60, 20);
    protected static Weapon dagger = new Weapon("Knife of Blood", "Dagger", 24, 46);

    public static void choseWeapon() {
        System.out.println("1. " + axe.nameOfWeapon);
        System.out.println("2. " + bow.nameOfWeapon);
        System.out.println("3. " + dagger.nameOfWeapon);
        System.out.println("4. " + sword.nameOfWeapon);
        System.out.println("5. " + staffOfSoul.nameOfWeapon);

        System.out.println("Which weapon you need ?");
        int choice = Main.validatesInputNumber();
        Main.choiceFromTo(choice, 1, 5);

        /* todo: cleanup
        switch (choice) {
            case 1:
                player.characterWeapon = axe.nameOfWeapon;
                System.out.println("Great, you chose the mace: " + player.characterWeapon);
                weaponDamage();
                Main.loading(300);
                Player.action1();
                break;
            case 2:
                player.characterWeapon = bow.nameOfWeapon;
                System.out.println("Great, you chose the bow: " + player.characterWeapon);
                weaponDamage();
                Main.loading(300);
                Player.action1();
                break;
            case 3:
                characterWeapon = dagger.nameOfWeapon;
                System.out.println("Great, you chose the dagger: " + characterWeapon);
                weaponDamage();
                Main.loading(300);
                Player.action1();
                break;
            case 4:
                characterWeapon = sword.nameOfWeapon;
                System.out.println("Great, you chose the sword: " + characterWeapon);
                weaponDamage();
                Main.loading(300);
                Player.action1();
                break;
            case 5:
                characterWeapon = sword.nameOfWeapon;
                System.out.println("Great, you chose the staff: " + characterWeapon);
                weaponDamage();
                Main.loading(300);
                Player.action1();
                break;
            default:
                break;
        }
         */
    }

    public static List<Equipment> createWeaponsList() {
        List<Equipment> weaponList = new ArrayList<>();
        weaponList.add(axe);
        weaponList.add(bow);
        weaponList.add(dagger);
        weaponList.add(sword);
        weaponList.add(staffOfSoul);

        return weaponList;

    }


    public static void weaponDamage() {
        /* todo: cleanup
        for (Equipment weapon : createWeaponsList()) {
            if (weapon.nameOfWeapon.equalsIgnoreCase(player.characterWeapon)) {
                player.damage += weapon.dmg;
                player.crtDamage += weapon.crtCh;

            }
        }
         */
    }
}
