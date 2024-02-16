public class Attack {
    private int hitChance;
    private int damage;

    private boolean landAttack;

    public int attackResult(int str, int dex, int agl) {
        this.hitChance = agl * dex;//place holder change us
        this.damage = str * dex / 2;
        return 0;
    }
}
