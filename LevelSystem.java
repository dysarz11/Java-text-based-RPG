import java.util.Scanner;

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

    public void playerLevelUp(PlayerStats playerStats, Scanner kb) {
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
            System.out.println("""
                        Enter the corresponding number for the specific stat to level
                        STR: 1
                        DEX: 2
                        AGL: 3
                        INT: 4
                        FTH: 5
                        LUCK: 6
                        
                        """);

            for (int i = 0; i < 8; i++) { //Replace 8 with a stat point variable
                int skillInput;
                System.out.print("Point # " + (i + 1) + ": ");
                skillInput = kb.nextInt();

                switch (skillInput) {
                    case 1 -> {
                        playerStats.addPlayerSTR(1);
                        System.out.println("STR increased by 1");
                        System.out.println("Current STR: " + playerStats.getPlayerSTR());
                    }
                    case 2 -> {
                        playerStats.addPlayerDEX(1);
                        System.out.println("DEX increased by 1");
                        System.out.println("Current DEX: " + playerStats.getPlayerDEX());
                    }
                }
            }
        }
    }
}
