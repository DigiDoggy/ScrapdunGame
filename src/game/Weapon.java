package game;

public class Weapon {

    private String typeOfWeapon;
    private int dmg;


    //setters
    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    //getters
    public String getTypeOfWeapon(String typeOfWeapon) {
        return typeOfWeapon;
    }

    public int getDmg() {
        return dmg;
    }


    public String printWeaponInfo() {
        System.out.println("Your have found new weapon : ");
        System.out.println("Name - " + typeOfWeapon);
        System.out.println("Damage - " + dmg);


        return null;
    }
}
