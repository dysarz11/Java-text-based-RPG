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

    public void playerLevelUp(PlayerStats playerStats) {
        if (XP >= 10) {
            this.playerLevel++;
            this.XP = 0;

            System.out.println("You are now level" + this.playerLevel);
            System.out.println("You have 8 stat points to allocate \n");
            System.out.println("current stats");
            System.out.println("STR: " + playerStats.getPlayerSTR());
            System.out.println("DEX: " + playerStats.getPlayerDEX());
            System.out.println("AGL: " + playerStats.getPlayerAGL());
            System.out.println("INT: " + playerStats.getPlayerINT());
            System.out.println("FTH: " + playerStats.getPlayerFTH());
            System.out.println("LUCK: " + playerStats.getPlayerLuck() + "\n");
        }
    }
}
