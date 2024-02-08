package digidoggy.scrapdun.weapens;

import digidoggy.scrapdun.common.NumberChooser;
import digidoggy.scrapdun.model.Player;

import java.util.LinkedHashMap;
import java.util.Map;

public class WeaponSelection {

    private final WeaponsInventory weaponsInventory;

    private final Map<Integer, WeaponType> weaponSelection;
    private NumberChooser numberChooser;

    public WeaponSelection(NumberChooser numberChooser) {
        this.weaponsInventory = new WeaponsInventory();
        this.numberChooser = numberChooser;
        this.weaponSelection = new LinkedHashMap<>() {{
            put(1, WeaponType.AXE);
            put(2, WeaponType.SWORD);
            put(3, WeaponType.STAFF);
            put(4, WeaponType.BOW);
            put(5, WeaponType.DAGGER);
        }};
    }

    public void chooseWeapon(Player player) {

        int selectedNumber = numberChooser.chooseNumberFromTo(1, weaponSelection.size());
        WeaponType selectedType = weaponSelection.get(selectedNumber);
        Weapon getWeapon = weaponsInventory.getInventory().get(selectedType);

        player.setWeapon(getWeapon);
    }

    public void getNameOfWeapon() {
        weaponsInventory.getInventory().forEach((type, weapons) -> {
            String weaponName = weapons.getNameOfWeapon();

            System.out.println("Weapon: " + weaponName);
        });
        System.out.println();
    }

    public void playerWeaponView(Player player) {
        System.out.println(player.getWeapon().getNameOfWeapon() + "\n");
    }

}
