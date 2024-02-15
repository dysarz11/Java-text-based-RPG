public class Main {
    public static void main(String[] args) {
        int hpTest;
        int strTest;
        int dexTest;
        int aglTest;

        PlayerStats playerStats = new PlayerStats();

        playerStats.setPlayerHP(20);
        playerStats.setPlayerSTR(3);
        playerStats.setPlayerDEX(2);
        playerStats.setPlayerAGL(4);

        hpTest = playerStats.getPlayerHP();
        strTest = playerStats.getPlayerSTR();
        dexTest = playerStats.getPlayerDEX();
        aglTest = playerStats.getPlayerAGL();
        System.out.println(hpTest + "\n" + strTest + "\n" + dexTest + "\n" + aglTest);
    }
}
