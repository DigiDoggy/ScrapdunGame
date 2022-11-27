package game;

import static game.Player.playerArmor;

public class Armor extends Equipment{
    //Constructor for armor
    public Armor(String nameOfArmor, int def, String type,String position) {
        super(nameOfArmor, def, type, position);
    }
//Параметр "Урон броне противника" есть на штурмовых винтовках - он варьируется на PTS 1.5 от 17.5% до 24%, а также на снаряжении. С учетом этого, общий параметр "Урон броне противника" можно поднять в среднем до 40%. Тогда итоговое смягчение урона броней будет: Броня%_итог3 = 60% / 100 * (100 - (40% * 0.3) = 52,8%.
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


    public static void choceArmor(){
        System.out.println("You examined the corpse and found:" + "\n" +
                armorLonelyChest.nameOfArmor + "\n" +
                armorMajorGloves.nameOfArmor + "\n" +
                armorShadowBoots.nameOfArmor );

        System.out.println("If you collect a set of armor," + "\n" +
                " you can get additional characteristics.");

        System.out.println("What kit do you want to build?");

        System.out.println("1.Shadow - Light " + "\n" +
                "2.Lonely - Heavy"+ "\n" +
                "3.Major - Cotton (Mage set)" + "\n" +
                "4.go back");

        int select = Main.validatesInputNumber();
        Main.choiceFromTo(select,1,4);

        switch (select){
            case 1:
                playerArmor.add(Armor.armorShadowBoots.nameOfArmor);
                playerArmor.add(Armor.armorShadowChest.nameOfArmor);
                playerArmor.add(Armor.armorShadowGloves.nameOfArmor);
                playerArmor.add(Armor.armorShadowHelmet.nameOfArmor);
                System.out.println("You decided to collect light armor, " + "\n" +
                        "and for this marched across the battlefield and found the remaining" + "\n" +
                        "set parts.");
                Main.loading(300);
                System.out.println("Great you have a complete set,"+ "\n" +
                        "but you found another different kind of weapon");
                // Вставить перечень оружия
                Weapon.choseWeapon();

                break;
            case 2:
                playerArmor.add(Armor.armorLonelyChest.nameOfArmor);
                playerArmor.add(Armor.armorLonelyHelmet.nameOfArmor);
                playerArmor.add(Armor.armorLonelyGloves.nameOfArmor);
                playerArmor.add(Armor.armorLonelyBoots.nameOfArmor);
                System.out.println("You decided to collect Heavy armor, " + "\n" +
                        "and for this marched across the battlefield and found the remaining" + "\n" +
                        "set parts.");
                Main.loading(300);
                System.out.println("Great you have a complete set,"+ "\n" +
                        "but you found another different kind of weapon");
                // Вставить перечень оружия
                Weapon.choseWeapon();
                break;
            case 3:
                playerArmor.add(Armor.armorMajorGloves.nameOfArmor);
                playerArmor.add(Armor.armorMajorChest.nameOfArmor);
                playerArmor.add(Armor.armorMajorBoots.nameOfArmor);
                playerArmor.add(Armor.armorMajorHelm.nameOfArmor);
                System.out.println("You decided to collect Mage set, " + "\n" +
                        "and for this marched across the battlefield and found the remaining" + "\n" +
                        "set parts.");
                Main.loading(300);
                System.out.println("Great you have a complete set,"+ "\n" +
                        "Well now you consider yourself a magician." + "\n" +
                        "And for this marched across the battlefield and found the remaining" + "\n" +
                        "but you found another different kind of weapon.");
                // Вставить перечень оружия
                Weapon.choseWeapon();
                break;
            case 4:
                System.out.println("Need to think.");
                Player.action1();
                break;

        }
    }

}




