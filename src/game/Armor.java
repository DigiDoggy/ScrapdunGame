package game;

public class Armor {
    // def zna4it deffence of armor
    private String nameOfArmor;
    private int def;
    private String type;

    //setters
    public void setNameOfArmor(String nameOfArmor) {
        this.nameOfArmor = nameOfArmor;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setType(String type) {
        this.type = type;
    }

    //getters
    public String getNameOfArmor(String nameOfArmor) {
        return nameOfArmor;
    }

    public int getDef() {
        return def;
    }

    public String getType(String type) {
        return type;
    }

    public String printArmorInfo() {
        System.out.println("Your have found new eqipment : ");
        System.out.println("Name - " + nameOfArmor);
        System.out.println("Defence - " + def);
        System.out.println("Type - " + type);

        return null;

    }
}



