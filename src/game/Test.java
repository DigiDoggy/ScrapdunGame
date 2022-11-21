package game;

public class Test {
    public static void main(String[] args) {

        backspace();
    }

    public static void backspace(){
        String test = "test";
        for (int i=0; i<test.length();i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(test.charAt(i));
        }
        for (int i=0; i<test.length();i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\b");
        }
    }
}
