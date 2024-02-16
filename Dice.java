import java.util.Random;

public class Dice {
    public int d20(Random rand) {
        int d20 = rand.nextInt(20) + 1;
        return d20;
    }

    public int d6(Random rand) {
        int d6 = rand.nextInt(6) + 1;
        return d6;
    }
}
