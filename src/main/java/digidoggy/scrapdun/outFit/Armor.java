package digidoggy.scrapdun.outFit;

public class Armor {
    private String nameOfArmor;
    private ArmorSelection armorSelection;
    private int def;
    private ArmorType type;
    private ArmorPosition position;

    Armor(String nameOfArmor, int def, ArmorPosition position) {
        this.nameOfArmor = nameOfArmor;
        this.def = def;
        this.position = position;
    }

    public Armor(ArmorInventory armorInventory) {
    }

    @Override
    public String toString() {
        return "Armor{" +
                "nameOfArmor='" + nameOfArmor + '\'' +
                ", def=" + def +
                ", type=" + type +
                ", position=" + position +
                '}';
    }

    public int getDef() {
        return def;
    }

    public String getNameOfArmor() {
        return nameOfArmor;
    }
}
