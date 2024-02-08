package digidoggy.scrapdun.outFit;

import java.util.*;

public class ArmorInventory {

    private final Map<ArmorType, List<Armor>> inventory = new HashMap<>() {{
        put(ArmorType.HEAVY, List.of(
                new Armor("Lonely Scaled ChestGuard", 150, ArmorPosition.CHEST),
                new Armor("Lonely Scaled Legs", 50, ArmorPosition.BOOTS),
                new Armor("Lonely Scaled Gloves", 25, ArmorPosition.GLOVES),
                new Armor("Lonely Scaled Helmet", 35, ArmorPosition.HELMET)
        ));
        put(ArmorType.LIGHT, List.of(
                new Armor("Shadow Cloth Wraps", 70, ArmorPosition.CHEST),
                new Armor("Shadow Cloth Hat", 30, ArmorPosition.HELMET),
                new Armor("Shadow Cloth Gloves", 20, ArmorPosition.GLOVES),
                new Armor("Shadow Cloth Boots", 19, ArmorPosition.BOOTS)
        ));
        put(ArmorType.ROBE, List.of(
                new Armor("Major Arcana Robe", 50, ArmorPosition.CHEST),
                new Armor("Major Arcana Circlet", 20, ArmorPosition.HELMET),
                new Armor("Major Arcana Gloves", 15, ArmorPosition.GLOVES),
                new Armor("Major Arcana Boots", 15, ArmorPosition.BOOTS)
        ));

    }};

    public Map<ArmorType, List<Armor>> getInventory() {
        return inventory;
    }


}
