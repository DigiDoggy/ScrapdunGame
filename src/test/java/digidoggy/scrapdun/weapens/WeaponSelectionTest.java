package digidoggy.scrapdun.weapens;

import digidoggy.scrapdun.common.NumberChooser;
import digidoggy.scrapdun.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class WeaponSelectionTest {
    @Mock
    private NumberChooser numberChooser;

    @Mock
    WeaponType weaponType;
    @Mock
    private WeaponsInventory weaponsInventory;

    private WeaponSelection weaponSelection;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        weaponSelection = new WeaponSelection(numberChooser);
    }

    @Test
    void testChooseWeapon() {
        User user = new User("npc", 100, 0, 0, false);
        when(numberChooser.chooseNumberFromTo(1, 5)).thenReturn(2);

        Map<WeaponType, Weapon> mockInventory = new LinkedHashMap<>();
        mockInventory.put(WeaponType.SWORD, new Weapon("Sword of Destiny", 45, 18));

        when(weaponsInventory.getInventory()).thenReturn(mockInventory);

        weaponSelection.chooseWeapon(user);


        assertNotNull(user.getWeapon(), "user weapon");
        assertEquals(45, user.getDamage(), "sword damage");
        assertEquals("Sword of Destiny", user.getWeapon().getNameOfWeapon(), "Weapon name");
    }

    @org.junit.jupiter.api.Test
    void getNameOfWeapon() {
    }

    @org.junit.jupiter.api.Test
    void playerWeaponView() {
    }
}