package digidoggy.scrapdun.outFit;

import digidoggy.scrapdun.common.NumberChooser;
import digidoggy.scrapdun.model.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmorSelection {

    private ArmorInventory armorInventory;
    private Map<Integer, ArmorType> selectArmor;
    private NumberChooser numberChooser;

    public ArmorSelection(NumberChooser numberChooser) {
        this.armorInventory = new ArmorInventory();
        this.numberChooser = numberChooser;
        this.selectArmor = new HashMap<>() {{
            put(1, ArmorType.HEAVY);
            put(2, ArmorType.LIGHT);
            put(3, ArmorType.ROBE);
        }};
    }

    public Player chooseArmor(Player player) {

        int selectedNumber = numberChooser.chooseNumberFromTo(1, selectArmor.size());
        ArmorType selectedType = selectArmor.get(selectedNumber);
        List<Armor> getArmor = armorInventory.getInventory().get(selectedType);

        player.setDefense(
                getArmor.stream()
                        .mapToInt(Armor::getDef)
                        .sum()
        );
        player.setPlayerArmor(getArmor);
        return player;
    }

    public void getNameOfArmor() {
        armorInventory.getInventory().forEach((type, armors) -> {
            Armor firstArmor = armors.get(0);
            String name = firstArmor.getNameOfArmor();
            System.out.println("Armor: " + name);
        });

    }

    public void playerArmorView(Player player) {

        player.getPlayerArmor().stream()
                .map(Armor::getNameOfArmor)
                .forEach(System.out::println);
        System.out.println();
    }
}
