package digidoggy.scrapdun.weapens;


import digidoggy.scrapdun.outFit.ArmorSelection;

public class Weapon {
    //todo delete criticalDamage
    private String nameOfWeapon;
    private int damage;
    private ArmorSelection armorSelection;
    private WeaponSelection weaponSelection;
    private int criticalDamage;


    public Weapon(String nameOfWeapon, int damage, int criticalDamage) {
        this.nameOfWeapon = nameOfWeapon;
        this.damage = damage;
        this.criticalDamage = criticalDamage;
    }
    //Getters Setters

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }

    public int getDamage() {
        return damage;
    }

}
