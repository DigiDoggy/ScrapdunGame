package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class KostjaTestClass {



/*
        Armor armor1 = new Armor();
        //устанавливаю значения к классу брони
        //Armor1 Lonely Scaled ChestGuard Type: Heavy , Def:150.

        armor1.setNameOfArmor("Lonely Scaled ChestGuard");
        armor1.setDef(150);
        armor1.setType("Heavy");

        //Armor2 Bastion of Frost Power  Type: Heavy, Def:130.
        Armor armor2 = new Armor();
        armor2.setNameOfArmor("Bastion of Frost Power");
        armor2.setDef(130);
        armor2.setType("Heavy");


        //Armor3 Shadow Cloth Wraps  Type:LIGHT , Def: 70
        Armor armor3 = new Armor();
        armor3.setNameOfArmor("Shadow Cloth Wraps");
        armor3.setDef(70);
        armor3.setType("Light");

        //Armor4 Raiment of Redemption  Type:LIGHT, Def: 50

        Armor armor4 = new Armor();
        armor4.setNameOfArmor("Raiment of Redemption");
        armor4.setDef(50);
        armor4.setType("Light");


        System.out.println(armor1.printArmorInfo());
        System.out.println(armor2.printArmorInfo());
        System.out.println(armor3.printArmorInfo());
        System.out.println(armor4.printArmorInfo());


        //sozdaju oruzie

        Weapon weapon1 = new Weapon();
        weapon1.setTypeOfWeapon("Axe of Infinity");
        weapon1.setDmg(30);


        Weapon weapon2 = new Weapon();
        weapon2.setTypeOfWeapon("Sword of Destiny");
        weapon2.setDmg(40);


        Weapon weapon3 = new Weapon();
        weapon3.setTypeOfWeapon("Rat's knife");
        weapon3.setDmg(15);

        System.out.println(weapon1.printWeaponInfo()); */

    //fighting system my way

    // нажми цифру 1 в консоле для удара или цифру 2 для удара .
    public static void isGame() {
        int playerHealt = 100;
        int opHealth = 100;
        boolean game = true;
        while (game) {
            try {
                Scanner scanner = new Scanner(System.in);
                int num1 = scanner.nextInt();
                if (num1 == 1) {
                    System.out.println("You hit your opponent");
                    System.out.println(" ");

                    Random random1 = new Random();
                    int punchAttack;
                    punchAttack = random1.nextInt(5);
                    switch (punchAttack) {
                        case 0:
                            for (int i = 1; i <= 15; i++) {
                                opHealth--;
                            }
                            System.out.println("You hitted your opponent");
                            break;
                        case 1:
                            for (int i = 1; i <= 15; i++) {
                                opHealth--;
                            }
                            System.out.println("You hitted your opponent into FACE!");
                            break;
                        case 2:
                            for (int i = 1; i <= 15; i++) {
                                opHealth--;
                            }
                            System.out.println("You hitted your opponent between TWO LEGS");
                            break;
                        case 3:
                            for (int i = 1; i <= 15; i++) {
                                opHealth--;
                            }
                            System.out.println("You hitted your opponent OOOUUcccchhh");
                            break;
                        case 4:
                            for (int i = 1; i <= 30; i++) {
                                opHealth--;
                            }
                            System.out.println("Critical HIT!!!!");
                            break;

                        default:
                            break;
                    }

                } else if (num1 == 2) {
                    System.out.println("you kicked your opponent ");
                    System.out.println(" ");
                    Random random2 = new Random();
                    int kickAttack;
                    kickAttack = random2.nextInt();

                }
                if (opHealth<=0){
                    opHealth=0;
                }
                System.out.println("Your opponets healts is : " + opHealth);
                System.out.println(" ");

                if (opHealth <= 0) {
                    System.out.println("YOU KILL THE ENEMIE!!");
                    game = false;
                    System.exit(0);
                }


            } catch (InputMismatchException e) {
            }

            // ataka vraga

            Random random2 = new Random();
            int attack;
            attack = random2.nextInt(6);
            switch (attack) {
                case 0:
                    System.out.println("Swagger punched you!");
                    System.out.println("Swagger hits u -10 dmg");
                    System.out.println(" ");
                    for (int i = 1; i <= 10; i++) {
                        playerHealt--;
                    }
                    break;
                case 1:
                    System.out.println("Swagger punched you!");
                    System.out.println("Swagger hits u -25 dmg");
                    System.out.println("CRITICAL DAMAGE");
                    System.out.println(" ");
                    for (int i = 1; i <= 25; i++) {
                        playerHealt--;
                    }
                    break;
                case 2:
                    System.out.println("Swagger punched you!");
                    System.out.println("Swagger hits u -13 dmg");
                    System.out.println(" ");
                    for (int i = 1; i <= 13; i++) {
                        playerHealt--;
                    }
                    break;
                case 3:
                    System.out.println("Swagger punched you!");
                    System.out.println("Swagger hits u -11 dmg");
                    System.out.println(" ");
                    for (int i = 1; i <= 11; i++) {
                        playerHealt--;
                    }
                    break;
                case 4:
                    System.out.println("Swagger punched you!");
                    System.out.println("Swagger hits u 0 dmg");
                    System.out.println(" ");
                    for (int i = 1; i <= 1; i++) {
                        playerHealt--;
                    }
                    break;
                case 5:
                    System.out.println("Swagger punched you!");
                    System.out.println("Swagger hits u -14 dmg");
                    System.out.println(" ");
                    for (int i = 1; i <= 14; i++) {
                        playerHealt--;
                    }
                    break;
                case 6:
                    System.out.println("Swagger punched you!");
                    System.out.println("Swagger hits u -8 dmg");
                    System.out.println(" ");
                    for (int i = 1; i <= 8; i++) {
                        playerHealt--;
                    }
                    break;
                default:
                    break;
            }
            if(playerHealt < 0 ){
                playerHealt = 0;
            }
            System.out.println("Your healt is " + playerHealt);
            if (playerHealt <= 0) {
                System.out.println("You died! Try again next time");
                System.out.println(" ");

            } else if (playerHealt > 1) {
                game = true;
            }

            if (playerHealt >= 50) {
                System.out.println("|========      |" + playerHealt);

            }
        }


    }

}





