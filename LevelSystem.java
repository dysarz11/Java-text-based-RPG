public class LevelSystem {
    private int playerLevel;
    private int XP;

    public LevelSystem() {
        this.playerLevel = -1;
        this.XP = -1;
    }

    public void makeStartingPlayerStats(PlayerStats playerStats) {
        this.playerLevel = 1;
        this.XP = 0;

        playerStats.setPlayerHP(25);

        playerStats.setPlayerSTR(3);
        playerStats.setPlayerDEX(3);
        playerStats.setPlayerAGL(5);
    }

    public void addXP(int addedXP) {
        this.XP += addedXP;
    }

    public int getXP() {
        return XP;
    }

    public void playerLevelUp() {
        if (XP >= 10) {
            this.playerLevel++;
            this.XP = 0;
        }
    }
}
