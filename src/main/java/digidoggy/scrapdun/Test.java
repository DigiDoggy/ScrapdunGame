package digidoggy.scrapdun;

import java.util.Random;
import java.util.Scanner;



public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
testChoiceFromTo(1,4);
    }
    public static int newTest() {
        int numb;
        int number = 0;
        do {
            numb = 0;
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                System.out.printf("%s - is not an integer.%n", scanner.next());
                numb = 1;
            }
        } while (numb == 1);

        return number;
    }

    public static int testChoiceFromTo(int number, int num){
        int choice;
        do {
            choice = newTest();
            if ((choice < number) || (choice > num)) {
                System.out.println("There is no such option.");

            }
        }while ((choice < number) || (choice > num));

        return choice;
    }

}
