package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
TODO
 0.Begin story about player (prison, dungeon etc.)
 1. Player name  ( need for final result)
 2. Player hp
 3. Choice of ammunition based.
 4. Method of choice(Hit/Block)
 5.

 */
public class Player extends AbstractPlayers {

    public static Scanner scanner = new Scanner(System.in);
    private static String playerName;
    private static int playerDef;
    private static ArrayList<String> playerArmor = new ArrayList<>();



    // find out the name of the player
    public static String createName() {

        System.out.println("Hello new hero of that danger word.");
        System.out.println("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println(playerName + "you see many corpses after the battle, "+"\n" +
                "an empty military tent and a bush of berries growing next to you.");
        System.out.println("What will you do?");

        return playerName;
    }
    //method for user who find some item
    public static void action1(){

        System.out.println("1.Examine the corpses.");
        System.out.println("2.Go check out the tent.");
        System.out.println("3.Eat a berry");
        System.out.println("4.It's time to finish the game!");

        int choice  = Main.validatesInputNumber();

        Main.choiceFromTo(choice,1,4);



        switch (choice){
            case 1:
                choiceSet();
                break;
            case 2:
                System.out.println("You enter the tent and immediately pay attention to the chest.");
                System.out.println("You opened the chest and found:" + "\n" +
                        Armor.armorShadowBoots.nameOfArmor );

                break;
            case 3:
                //some method

                break;
            default:
                // leave method

                break;
        }


    }

    public static void choiceSet(){
        System.out.println("You examined the corpse and found:" + "\n" +
                Armor.armorLonelyChest.nameOfArmor + "\n" +
                Armor.armorMajorGloves.nameOfArmor + "\n" +
                Armor.armorShadowBoots.nameOfArmor );

        System.out.println("If you collect a set of armor," + "\n" +
                " you can get additional characteristics.");

        System.out.println("What kit do you want to build?");

        System.out.println("1.Shadow - Light " + "\n" +
                "2.Lonely - Heavy"+ "\n" +
                "3.Major - Cotton (Mage set)" + "\n" +
                "4.go back");

        int select = Main.validatesInputNumber();
        Main.choiceFromTo(select,1,4);

        switch (select){
            case 1:
                playerArmor.add(Armor.armorShadowBoots.nameOfArmor);
                playerArmor.add(Armor.armorShadowChest.nameOfArmor);
                playerArmor.add(Armor.armorShadowGloves.nameOfArmor);
                playerArmor.add(Armor.armorShadowHelmet.nameOfArmor);
                System.out.println("Вы решили собрать легкую броню, " + "\n" +
                        "и для это решили походить по полю битвы и найти оставшиеся" + "\n" +
                        "части сета.");
                Main.loading(300);
                System.out.println("Отлично у вас есть полный сет,"+ "\n" +
                        "Но вы нашли еще разного вида оружия");
                // Вставить перечень оружия
                break;
            case 2:
                playerArmor.add(Armor.armorLonelyChest.nameOfArmor);
                playerArmor.add(Armor.armorLonelyHelmet.nameOfArmor);
                playerArmor.add(Armor.armorLonelyGloves.nameOfArmor);
                playerArmor.add(Armor.armorLonelyBoots.nameOfArmor);
                System.out.println("Вы решили собрать тяжелую броню, " + "\n" +
                        "и для это решили походить по полю битвы и найти оставшиеся" + "\n" +
                        "части сета.");
                Main.loading(300);
                System.out.println("Отлично у вас есть полный сет,"+ "\n" +
                        "Но вы нашли еще разного вида оружия");
                // Вставить перечень оружия
                break;
            case 3:
                playerArmor.add(Armor.armorMajorGloves.nameOfArmor);
                playerArmor.add(Armor.armorMajorChest.nameOfArmor);
                playerArmor.add(Armor.armorMajorBoots.nameOfArmor);
                playerArmor.add(Armor.armorMajorHelm.nameOfArmor);
                System.out.println("Вы решили собрать магический сет, " + "\n" +
                        "и для это решили походить по полю битвы и найти оставшиеся" + "\n" +
                        "части сета.");
                Main.loading(300);
                System.out.println("Отлично у вас есть полный сет,"+ "\n" +
                        "вы одели и почувствовали не веданную до этого момента силу, но кроме этого" + "\n" +
                        "Но вы нашли еще разного вида оружия");
                // Вставить перечень оружия
                break;
            case 4:
                System.out.println("Need to think.");
                action1();
                break;

        }
    }
    //подсчет защиты игрока.
    public static int playerDefence(){

        return playerDef;
    }





    //Random Method
    public static int Random(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }


}
