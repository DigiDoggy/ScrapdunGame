package game;


public class Weapon extends Equipment {

    public Weapon(String nameOfWeapon, String typeOfWeapon, int dmg, int crtCh) {
        super(nameOfWeapon, typeOfWeapon, dmg, crtCh);
    }


    protected static Weapon axe = new Weapon("Axe of Infinity", "Axe", 30, 14);
    protected static Weapon sword = new Weapon("Sword of Destiny", "Sword", 45, 18);
    protected static  Weapon staffOfSoul = new Weapon("Staff of Soul", "Staff", 25, 8);
    protected static  Weapon bow = new Weapon("Bow of Light", "Bow", 60, 20);
    protected static  Weapon dagger = new Weapon("Knife of Blood", "Dagger", 24, 46);

    public static void choseWeapon(){
        System.out.println("1. " + axe.nameOfArmor);
        System.out.println("2. " + bow.nameOfArmor);
        System.out.println("3. " + dagger.nameOfArmor);
        System.out.println("4. " + sword.nameOfArmor);
        System.out.println("5. " + staffOfSoul.nameOfArmor);

        System.out.println("Which weapon you need ?");
        int choice = Main.scanner.nextInt();
        Main.validatesInputNumber();
        Main.choiceFromTo(choice,1,5);

        switch (choice){
            case 1:
                Player.playerWeapon.add(axe.nameOfWeapon);
                System.out.println("Great, you chose the mace.");
                break;
            case 2:
                Player.playerWeapon.add(bow.nameOfWeapon);
                System.out.println("Great, you chose the bow.");
                break;
            case 3:
                Player.playerWeapon.add(dagger.nameOfWeapon);
                System.out.println("Great, you chose the dagger.");
                break;
            case 4:
                Player.playerWeapon.add(sword.nameOfWeapon);
                System.out.println("Great, you chose the sword.");
                break;
            case 5:
                Player.playerWeapon.add(staffOfSoul.nameOfWeapon);
                System.out.println("Great, you chose the staff");
                break;
            default:
                break;
        }

    }
}
