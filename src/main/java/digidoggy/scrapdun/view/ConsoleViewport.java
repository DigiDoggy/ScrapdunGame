package digidoggy.scrapdun.view;

import java.io.PrintStream;

public class ConsoleViewport {
    private final PrintStream stream;

    public ConsoleViewport(final PrintStream stream) {
        this.stream = stream;
    }

    public void draw(final String token) {
        stream.print('\r');
        stream.print(token);
    }

    public static void main(String[] args) {
        final var viewport = new ConsoleViewport(System.out);
        viewport.draw("@");
    }
}