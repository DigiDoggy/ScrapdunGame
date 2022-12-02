package digidoggy.scrapdun.model;


/*
todo
 1. Create story
 2.Create fight system (random hit and random block)
 3. Choice of ammunition based on random.
 */
public class Npc{

    protected static String npcCharacterName ;
    protected static int NpcHealth = 100;
    protected static String npcCharacterWeapon ;
    public static int npcDamage = 10;
    protected static int npcDefence = 10;

    public Npc(String npcCharacterName, int health, int damage, int defence){
        Npc.npcCharacterName =npcCharacterName;
        Npc.NpcHealth =health;
        Npc.npcDamage = damage;
        Npc.npcDefence = defence;

        System.out.println("characterName: " + npcCharacterName + "\n" +
                "health: " + NpcHealth + "\n" +
                "damage: " + npcDamage + "\n" +
                "defence: " + npcDefence);
    }

}