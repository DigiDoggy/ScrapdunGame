package digidoggy.scrapdun.model;

import digidoggy.scrapdun.common.RandomNumberGeneratorImpl;
import digidoggy.scrapdun.outFit.ArmorSelection;
import digidoggy.scrapdun.outFit.ArmorType;
import digidoggy.scrapdun.weapens.WeaponSelection;

import java.util.Map;

public class Npc extends Player {
    private Map<Integer, ArmorType> ArmorSelection;
    private ArmorSelection armorSelection;
    protected WeaponSelection weaponSelection;

    public Npc(String name, int health, int damage, int defence) {
        super("NPC", 100, damage, defence);
        this.armorSelection = new ArmorSelection(new RandomNumberGeneratorImpl());
        this.weaponSelection = new WeaponSelection(new RandomNumberGeneratorImpl());

        this.armorSelection.chooseArmor(this);
        this.weaponSelection.chooseWeapon(this);

    }
}