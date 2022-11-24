package game;

abstract class Equipment {


    //armor
    protected String nameOfArmor;
    protected int def;
    protected String type;
    //weapon
    protected String nameOfWeapon;
    protected String typeOfWeapon;
    protected int dmg;
    protected  int crtCh;

    //constructor armor
    public Equipment(String nameOfArmor, int def, String type) {
        this.nameOfArmor = nameOfArmor;
        this.def = def;
        this.type = type;
    }
    //constructor weapon

    public Equipment(String nameOfWeapon, String typeOfWeapon, int dmg, int crtCh) {
        this.nameOfWeapon = nameOfWeapon;
        this.typeOfWeapon = typeOfWeapon;
        this.dmg = dmg;
        this.crtCh = crtCh;
    }

    // to String

    @Override
    public String toString() {
        return "Equipment{" +
                "nameOfArmor='" + nameOfArmor + '\'' +
                ", def=" + def +
                ", type='" + type + '\'' +
                ", nameOfWeapon='" + nameOfWeapon + '\'' +
                ", typeOfWeapon='" + typeOfWeapon + '\'' +
                ", dmg=" + dmg +
                ", crtCh=" + crtCh +
                '}';
    }
}
