package game;

import java.util.ArrayList;

abstract class Characters {

    protected String characterName ;
    protected int health = 100;
    protected String Weapon ;
    protected String ArmorsHead ;
    protected String ArmorBody ;
    protected String ArmorLegs ;
    protected String ArmorArms ;
    protected int damage = 10;
    protected int crtDamage = 5;
    protected String block;
    protected int defence = 10;
    protected ArrayList<String> armor = new ArrayList<>();


// constructor for characteristic




    public Characters(int health, int damage, int crtDamage, int defence) {
        this.health = health;
        this.damage = damage;
        this.crtDamage = crtDamage;
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "health=" + health +
                ", damage=" + damage +
                ", crtDamage=" + crtDamage +
                ", defence=" + defence +
                '}';
    }
    public void characterArmor(String armorName){
        armor.add(armorName);
    }
    public int calculateArmorDef(){

        return defence;
    }



}
