package digidoggy.scrapdun.model;


import digidoggy.scrapdun.Armor;
import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.Weapon;

/*
todo
 1. Create story
 2.Create fight system (random hit and random block)
 3. Choice of ammunition based on random.
 */
public class Npc{

    protected static String npcCharacterName ;
    protected static int npcHealth = 100;
    public static int npcDamage = 10;
    protected static int npcDefence = 10;

    public Npc(String npcCharacterName, int health, int damage, int defence){
        Npc.npcCharacterName =npcCharacterName;
        Npc.npcHealth =health;
        Npc.npcDamage = damage;
        Npc.npcDefence = defence;

        System.out.println("characterName: " + npcCharacterName + "\n" +
                "health: " + npcHealth + "\n" +
                "damage: " + npcDamage + "\n" +
                "defence: " + npcDefence);
    }

    Npc npc = new Npc(npcCharacterName, npcHealth, npcDamage,npcDefence);

    //Calculate defence for NPC
    public static void calculateDefenceForNPC(int defOfArmor){
        Npc.npcDefence+=defOfArmor;
    }
    //Npc choose armor
    public static void npcChooseArmor(){

        int armorSetAmount = Main.Random(3);

        if (armorSetAmount==1){
            calculateDefenceForNPC(Armor.defenceLonely());
        }else if (armorSetAmount==2){
            calculateDefenceForNPC(Armor.defenceShadow());
        }else{
            calculateDefenceForNPC(Armor.defenceMajor());
        }
    }

    //Calculate damage for NPC
    private static void calculateDamageForNpc(int weaponDamage){
        Npc.npcDamage += weaponDamage;
    }
    //Npc choose weapon
    public static void npcChooseWeapon(){
        int weaponAmount = Main.Random(5);

        calculateDamageForNpc(Weapon.damageFromWeapon(weaponAmount));

    }


}