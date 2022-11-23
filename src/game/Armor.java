package game;

public class Armor {

    protected String nameOfArmor;
    protected int def;
    protected String type;

    // armor constructor
    public Armor (String nameOfArmor,int def, String type){
        this.nameOfArmor =nameOfArmor;
        this.type = type;
        this.def = def;
    }
// toString - realisation for armor constructor
    public String toString() {
        return "Name of armor - " + nameOfArmor
                + " |  Defence - " + def
                + " |  Type - " + type  ;
    }

    //setters
//    public void setNameOfArmor(String nameOfArmor) {
//        this.nameOfArmor = nameOfArmor;
//    }
//
//    public void setDef(int def) {
//        this.def = def;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    //getters
//    public String getNameOfArmor(String nameOfArmor) {
//        return nameOfArmor;
//    }
//
//    public int getDef() {
//        return def;
//    }
//
//    public String getType(String type) {
//        return type;
//    }

    public String printArmorInfo() {
        System.out.println("Your have found new eqipment : ");
        System.out.println("Name - " + nameOfArmor);
        System.out.println("Defence - " + def);
        System.out.println("Type - " + type);

        return null;

    }


}



