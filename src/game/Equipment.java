package game;

import java.util.ArrayList;
import java.util.Objects;

abstract class Equipment {


    //armor
    protected String nameOfArmor;
    protected int def;
    protected String type;
    protected String position;
    //weapon
    protected  String nameOfWeapon;
    protected String typeOfWeapon;
    protected int dmg;
    protected  int crtCh;

    //constructor armor
    public Equipment(String nameOfArmor, int def, String type,String position) {
        this.nameOfArmor = nameOfArmor;
        this.def = def;
        this.type = type;
        this.position= position;
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
        if (nameOfArmor==null){
            return "Equipment{" +
                    " nameOfWeapon='" + nameOfWeapon + '\'' +
                    ", typeOfWeapon='" + typeOfWeapon + '\'' +
                    ", dmg=" + dmg +
                    ", crtCh=" + crtCh +
                    '}';
        }else {
            return "Equipment{" +
                    "nameOfArmor='" + nameOfArmor + '\'' +
                    ", def=" + def +
                    ", type='" + type + '\'' +
                    ", position='" + position + '\'' +
                    '}';
        }


//        }
//        return "Equipment{" +
//                "nameOfArmor='" + nameOfArmor + '\'' +
//                ", def=" + def +
//                ", type='" + type + '\'' +
//                ", position='" + position + '\'' +
//                ", nameOfWeapon='" + nameOfWeapon + '\'' +
//                ", typeOfWeapon='" + typeOfWeapon + '\'' +
//                ", dmg=" + dmg +
//                ", crtCh=" + crtCh +
//                '}';
    }

}
