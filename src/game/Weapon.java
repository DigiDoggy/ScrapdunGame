package game;


public class Weapon extends Equipment {
    public Weapon(String nameOfWeapon, String typeOfWeapon, int dmg, int crtCh) {
        super(nameOfWeapon, typeOfWeapon, dmg, crtCh);
    }


    protected static Weapon Axe = new Weapon("Axe of Infinity", "Axe", 30, 14);
    protected static Weapon sword = new Weapon("Sword of Destiny", "Sword", 45, 18);
    protected static  Weapon StaffOfSoul = new Weapon("Staff of Soul", "Staff", 25, 8);
    protected static  Weapon bow = new Weapon("Bow of Light", "Bow", 60, 20);
    protected static  Weapon dagger = new Weapon("Knife of Blood", "Dagger", 24, 46);


}
