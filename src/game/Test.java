package game;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       check();
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

//    public static void backspace(){
//        String test = "test";
//        for (int i=0; i<test.length();i++){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print(test.charAt(i));
//        }
//        for (int i=0; i<test.length();i++){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print("\b");
//        }
//
//    }



}
