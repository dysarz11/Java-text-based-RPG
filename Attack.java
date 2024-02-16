import java.util.Random;

public class Attack {
    private int hitChance;
    private int damage;

    private boolean landAttack;

    private boolean hitResult(int agl, Random rand, Dice dice) {
        this.hitChance = agl + dice.d20(rand);

        if (hitChance > 14) {
            return true;
        }
        return false;
    }

    private int damage(int str, int dex, Random rand, Dice dice) {
        return ((str * dex) + dice.d6(rand)) / 2;
    }

    public int attackResult(int str, int dex, int agl, Random rand, Dice dice) {
        this.landAttack = hitResult(agl, rand, dice);

        if (this.landAttack == true) {
            //Multiply str and dex and add a d6 and divide by 2
            this.damage = damage(str, dex, rand, dice);
            return this.damage;
        }
        return 0;
    }
}
