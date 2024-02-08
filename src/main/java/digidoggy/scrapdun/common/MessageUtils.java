package digidoggy.scrapdun.common;

public class MessageUtils {
    static String chooseYourNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return String.format("Choose your number from %d to %d.", min, max);
    }

}
