package game;

import java.util.ArrayList;

public class Weapon {

    protected String nameOfWeapon;
    protected String typeOfWeapon;
    protected int dmg;
    protected  int crtCh;

    public Weapon (String nameOfWeapon,String typeOfWeapon, int dmg, int crtCh){
        this.nameOfWeapon = nameOfWeapon;
        this.typeOfWeapon = typeOfWeapon;
        this.dmg = dmg;
        this.crtCh = crtCh;
    }

    public String toString() {
        return "Name of weapon - " + nameOfWeapon
                + " |  Type of weapon - " + typeOfWeapon
                + " |  Damage of weapon - " + dmg
                + " |  Critical chance of weapon - " + crtCh;
    }

    public static void weapons(){

        Weapon Axe = new Weapon("Axe of Infinity", "Axe", 30, 14);
        Weapon sword = new Weapon("Sword of Destiny", "Sword", 45, 18);
        Weapon StaffOfSoul = new Weapon("Staff of Soul", "Staff", 25, 8);
        Weapon bow = new Weapon("Bow of Light", "Bow", 60,20 );
        Weapon dagger = new Weapon("Knife of Blood", "Dagger",24, 46);

        ArrayList<Weapon> weapon = new ArrayList<>();
        weapon.add(Axe);
        weapon.add(StaffOfSoul);
        weapon.add(bow);
        weapon.add(dagger);
// Loop for check
        for (Weapon nameOfWeapon : weapon) {
            System.out.println(nameOfWeapon);
        }


    }



//    //setters
//    public void setTypeOfWeapon(String typeOfWeapon) {
//        this.typeOfWeapon = typeOfWeapon;
//    }
//
//    public void setDmg(int dmg) {
//        this.dmg = dmg;
//    }
//
//    //getters
//    public String getTypeOfWeapon(String typeOfWeapon) {
//        return typeOfWeapon;
//    }
//
//    public int getDmg() {
//        return dmg;
//    }
//
//
//    public String printWeaponInfo() {
//        System.out.println("Your have found new weapon : ");
//        System.out.println("Name - " + typeOfWeapon);
//        System.out.println("Damage - " + dmg);
//
//
//        return null;
//    }
}
