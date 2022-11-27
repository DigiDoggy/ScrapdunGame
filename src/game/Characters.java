package game;

import java.util.ArrayList;

abstract class Characters {

    protected String characterName ;
    protected static int health = 100;
    protected String weapon ;
    protected String armorsHead ;
    protected String armorBody ;
    protected String armorLegs ;
    protected String armorArms ;
    protected int damage = 10;
    protected int crtDamage = 5;
    protected String block;
    protected int defence = 10;


    //getters and setters (


    //constructor for block and hit
    public Characters(String armorsHead, String armorBody, String armorLegs, String armorArms) {
        this.armorsHead = armorsHead;
        this.armorBody = armorBody;
        this.armorLegs = armorLegs;
        this.armorArms = armorArms;
    }

    // constructor for weapon

    public Characters(String weapon) {
        this.weapon = weapon;
    }

    // constructor for characteristic


    public Characters(String characterName, int health, String weapon, int damage, int crtDamage, String block, int defence) {
        this.characterName = characterName;
        this.health = health;
        this.weapon = weapon;
        this.damage = damage;
        this.crtDamage = crtDamage;
        this.block = block;
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "characterName='" + characterName + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                ", crtDamage=" + crtDamage +
                ", block='" + block + '\'' +
                ", defence=" + defence +
                '}';
    }

    public int calculateArmorDef(){

        return defence;
    }



}
