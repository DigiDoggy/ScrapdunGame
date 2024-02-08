package digidoggy.scrapdun.consol;

public class ConsoleOutput implements Message {
    public void displayOutput(String message) {
        System.out.println(message);
    }

    public void errorOutput(String message) {
        System.out.println(message);
    }
}