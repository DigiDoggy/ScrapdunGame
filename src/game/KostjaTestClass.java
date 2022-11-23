package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class KostjaTestClass {

    public static void main(String[] args) {

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
                    System.out.println("Your opponets healts is : " + opHealth);
                    System.out.println(" ");
                } catch (InputMismatchException e) {
                }
            }

        }
    }


