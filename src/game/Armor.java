package game;

import java.util.ArrayList;

public class Armor extends Equipment{
    //Constructor for armor
    public Armor(String nameOfArmor, int def, String type,String position) {
        super(nameOfArmor, def, type, position);
    }

    //Armor creating for usage
//Heavy
    protected static Armor armorLonelyChest = new Armor("Lonely Scaled ChestGuard", 150, "Heavy", "Chest");
    protected static Armor armorLonelyBoots = new Armor("Lonely Scaled Legs", 40, "Heavy", "Boots");
    protected static Armor armorLonelyGloves = new Armor("Lonely Scaled Gloves", 25, "Heavy", "Gloves");
    protected static Armor armorLonelyHelmet = new Armor("Lonely Scaled Helmet", 35, "Heavy", "Helmet");
//Light
    protected static Armor armorShadowChest = new Armor("Shadow Cloth Wraps", 70, "Light","Chest");
    protected static Armor armorShadowHelmet = new Armor("Shadow Cloth Hat", 20, "Light","Helmet");
    protected static Armor armorShadowGloves = new Armor("Shadow Cloth Gloves", 12, "Light","Gloves");
    protected static Armor armorShadowBoots = new Armor("Shadow Cloth Boots", 10, "Light","Boots");
//Robe
    protected static Armor armorMajorChest = new Armor("Major Arcana Robe", 50, "Cotton","Chest");
    protected static Armor armorMajorHelm = new Armor("Major Arcana Circlet", 50, "Cotton","Helmet");
    protected static Armor armorMajorGloves = new Armor("Major Arcana Gloves", 50, "Cotton","Gloves");
    protected static Armor armorMajorBoots = new Armor("Major Arcana Boots", 50, "Cotton","Boots");



}




