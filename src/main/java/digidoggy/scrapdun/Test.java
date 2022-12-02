package digidoggy.scrapdun;

import java.util.Random;
import java.util.Scanner;



public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static int check() {
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
    public static int Random(int number){
        Random random = new Random();
        return random.nextInt(number);
    }



}
