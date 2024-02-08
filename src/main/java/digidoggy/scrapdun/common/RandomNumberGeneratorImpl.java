package digidoggy.scrapdun.common;

public class RandomNumberGeneratorImpl implements NumberChooser {

    @Override
    public int chooseNumberFromTo(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
