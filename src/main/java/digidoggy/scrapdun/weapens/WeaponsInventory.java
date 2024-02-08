package digidoggy.scrapdun.weapens;


import java.util.LinkedHashMap;
import java.util.Map;

public class WeaponsInventory {
    private final Map<WeaponType, Weapon> inventory = new LinkedHashMap<>() {{
        put(WeaponType.AXE, new Weapon("Axe of Infinity", 30, 14)
        );
        put(WeaponType.SWORD, new Weapon("Sword of Destiny", 45, 18)
        );
        put(WeaponType.STAFF, new Weapon("Staff of Soul", 25, 8)
        );
        put(WeaponType.BOW, new Weapon("Bow of Light", 60, 20)
        );
        put(WeaponType.DAGGER, new Weapon("Knife of Blood", 24, 46)
        );
    }};

    public Map<WeaponType, Weapon> getInventory() {
        return inventory;
    }
}
