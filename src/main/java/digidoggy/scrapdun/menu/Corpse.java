package digidoggy.scrapdun.menu;

import digidoggy.scrapdun.common.UserInputChooser;
import digidoggy.scrapdun.consol.ConsoleOutput;
import digidoggy.scrapdun.model.Player;
import digidoggy.scrapdun.outFit.ArmorInventory;
import digidoggy.scrapdun.outFit.ArmorSelection;
import digidoggy.scrapdun.weapens.WeaponSelection;

public class Corpse implements MenuAction {
    private Player player;
    private ConsoleOutput consoleOutput;
    private ArmorSelection armorSelection;
    private WeaponSelection weaponSelection;
    private ArmorInventory armorInventory;

    public Corpse(Player player) {
        this.player = player;
        this.armorSelection = new ArmorSelection(new UserInputChooser());
        this.consoleOutput = new ConsoleOutput();
        this.weaponSelection = new WeaponSelection(new UserInputChooser());
    }

    @Override
    public void execute() {
        if (player.getDefense() == 0 && player.getDamage() <= 10) {
            //Armor
            consoleOutput.displayOutput("You examined the corpse and found:");
            armorSelection.getNameOfArmor();

            player = armorSelection.chooseArmor(player);
            consoleOutput.displayOutput("Now you have all armor set: ");
            armorSelection.playerArmorView(player);
            //Weapon
            consoleOutput.displayOutput("you also found weapons: ");
            weaponSelection.getNameOfWeapon();

            weaponSelection.chooseWeapon(player);
            consoleOutput.displayOutput("Now you have : \n");
            weaponSelection.playerWeaponView(player);
        } else {
            consoleOutput.displayOutput("You already have the equipment. \n");
        }

    }
}
