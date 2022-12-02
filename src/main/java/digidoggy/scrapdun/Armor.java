package digidoggy.scrapdun;

import digidoggy.scrapdun.model.Player;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Armor extends Equipment {
    //Constructor for armor
    public Armor(String nameOfArmor, int def, String type, String position) {
        super(nameOfArmor, def, type, position);
    }
    //Armor creating for usage
//Heavy
    protected static Armor armorLonelyChest = new Armor("Lonely Scaled ChestGuard", 150, "Heavy", "Chest");
    protected static Armor armorLonelyBoots = new Armor("Lonely Scaled Legs", 50, "Heavy", "Boots");
    protected static Armor armorLonelyGloves = new Armor("Lonely Scaled Gloves", 25, "Heavy", "Gloves");
    protected static Armor armorLonelyHelmet = new Armor("Lonely Scaled Helmet", 35, "Heavy", "Helmet");
    //Light
    protected static Armor armorShadowChest = new Armor("Shadow Cloth Wraps", 70, "Light", "Chest");
    protected static Armor armorShadowHelmet = new Armor("Shadow Cloth Hat", 30, "Light", "Helmet");
    protected static Armor armorShadowGloves = new Armor("Shadow Cloth Gloves", 20, "Light", "Gloves");
    protected static Armor armorShadowBoots = new Armor("Shadow Cloth Boots", 19, "Light", "Boots");
    //Robe
    protected static Armor armorMajorChest = new Armor("Major Arcana Robe", 50, "Cotton", "Chest");
    protected static Armor armorMajorHelm = new Armor("Major Arcana Circlet", 20, "Cotton", "Helmet");
    protected static Armor armorMajorGloves = new Armor("Major Arcana Gloves", 15, "Cotton", "Gloves");
    protected static Armor armorMajorBoots = new Armor("Major Arcana Boots", 15, "Cotton", "Boots");

//choose your armor
    public static void chooseArmor() {
        System.out.println("You examined the corpse and found:" + "\n" +
                armorLonelyChest.nameOfArmor + "\n" +
                armorShadowGloves.nameOfArmor + "\n" +
                armorMajorBoots.nameOfArmor);

        System.out.println("If you collect a set of armor," + "\n" +
                "it increase your defence.");


        System.out.println("What kit do you want to build?");
        System.out.println("1. Heavy armor." + "\n" +
                "2. Light armor." + "\n" +
                "3. Robe armor." + "\n" );


        int select = Main.validatesInputNumber();
        Main.choiceFromTo(select, 1, 3);

        switch (select){
            case 1:
                System.out.println("You have Heavy armor");
                Player.playerArmor.add(armorLonelyChest);
                Player.playerArmor.add(armorLonelyBoots);
                Player.playerArmor.add(armorLonelyGloves);
                Player.playerArmor.add(armorLonelyHelmet);

                Player.calculateDefenceForPlayer(defenceLonely());

                System.out.println("Now you have " + Player.defence);

                Main.loading(500);

                Weapon.choseWeapon();

                break;
            case 2:
                System.out.println("You have light armor");
                Player.playerArmor.add(armorShadowChest);
                Player.playerArmor.add(armorShadowHelmet);
                Player.playerArmor.add(armorShadowGloves);
                Player.playerArmor.add(armorShadowBoots);

                Player.calculateDefenceForPlayer(defenceShadow());

                System.out.println("Now you have " + Player.defence);
                System.out.println();

                Main.loading(500);

                Weapon.choseWeapon();

                break;

            case 3:
                System.out.println("You have light armor");

                Player.playerArmor.add(armorMajorChest);
                Player.playerArmor.add(armorMajorHelm);
                Player.playerArmor.add(armorMajorGloves);
                Player.playerArmor.add(armorMajorBoots);

                Player.calculateDefenceForPlayer(defenceMajor());

                System.out.println("Now you have " + Player.defence);
                System.out.println();

                Main.loading(500);

                Weapon.choseWeapon();


                break;



        }
    }


    //Methods create armorTypeArrayList
    public static int defenceLonely() {
        List<Equipment> lonely = new ArrayList<>();
        lonely.add(armorLonelyChest);
        lonely.add(armorLonelyHelmet);
        lonely.add(armorLonelyBoots);
        lonely.add(armorLonelyGloves);
        int valueOjDefence=0;
        for (Equipment armor: lonely) {
            valueOjDefence+=armor.def;
        }
        return valueOjDefence;

    }

    public int calculate(List<Equipment> equipment){
        int valueOjDefence=0;
        for (Equipment armor: equipment) {
            valueOjDefence+=armor.def;
        }
        return valueOjDefence;
    }

    public static int defenceShadow() {
        List<Equipment> shadow = new ArrayList<>();
        shadow.add(armorShadowChest);
        shadow.add(armorShadowHelmet);
        shadow.add(armorShadowBoots);
        shadow.add(armorShadowGloves);

        int valueOjDefence=0;
        for (Equipment armor: shadow) {
            valueOjDefence+=armor.def;
        }
        return valueOjDefence;
    }

    public static int defenceMajor() {
        List<Equipment> major = new ArrayList<>();
        major.add(armorMajorChest);
        major.add(armorMajorHelm);
        major.add(armorMajorBoots);
        major.add(armorMajorGloves);

        int valueOjDefence=0;
        for (Equipment armor: major) {
            valueOjDefence+=armor.def;
        }
        return valueOjDefence;
    }


}