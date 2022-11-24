package game;

import java.util.ArrayList;

public class Armor extends Equipment{
    //Constructor for armor
    public Armor(String nameOfArmor, int def, String type) {
        super(nameOfArmor, def, type);
    }

    //Armor creating for usage
public static void lonelyScaledArmor() {
    Armor armor = new Armor("Lonely Scaled ChestGuard", 150, "Heavy");
    Armor armor1 = new Armor("Lonely Scaled Legs", 40, "Heavy");
    Armor armor2 = new Armor("Lonely Scaled Gloves", 25, "Heavy");
    Armor armor3 = new Armor("Lonely Scaled Helmet", 35, "Heavy");

    ArrayList<Armor> lonelyScaled = new ArrayList<>();
    lonelyScaled.add(armor);
    lonelyScaled.add(armor1);
    lonelyScaled.add(armor2);
    lonelyScaled.add(armor3);

    //Loop only for test
    for (int i = 0; i < lonelyScaled.size(); i++) {
        if (i%4 == 0 || i == 0) {
            System.out.println(lonelyScaled.get(i));
        }
    }

}

public static void shadowClothArmor(){
    Armor armor4 = new Armor("Shadow Cloth Wraps", 70, "Light");
    Armor armor5 = new Armor("Shadow Cloth Hat", 20, "Light");
    Armor armor6 = new Armor("Shadow Cloth Gloves", 12, "Light");
    Armor armor7 = new Armor("Shadow Cloth Boots", 10, "Light");

    ArrayList<Armor> shadow = new ArrayList<>();
    shadow.add(armor4);
    shadow.add(armor5);
    shadow.add(armor6);
    shadow.add(armor7);

    //Loop only for test
    for (int i = 0; i < shadow.size(); i++) {
        if (i%4 == 0 || i == 0) {
            System.out.println(shadow.get(i));
        }
    }
}

public static void major(){

    Armor armor8 = new Armor("Major Arcana Robe", 50, "Cotton");
    Armor armor9 = new Armor("Major Arcana Circlet", 50, "Cotton");
    Armor armor10 = new Armor("Major Arcana Gloves", 50, "Cotton");
    Armor armor11 = new Armor("Major Arcana Boots", 50, "Cotton");

    ArrayList<Armor> major = new ArrayList<>();
    major.add(armor8);
    major.add(armor9);
    major.add(armor10);
    major.add(armor11);

    //Loop only for test
    for (int i = 0; i < major.size(); i++) {
        if (i%4 == 0 || i == 0) {
            System.out.println(major.get(i));
        }
    }

}



}
