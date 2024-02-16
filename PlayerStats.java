public class PlayerStats {
    private int playerHP;
    private int playerDefense;
    private int playerSTR;
    private int playerDEX;
    private int playerAGL;
    private int playerINT;
    private int playerFTH;
    private int playerLuck;

    public PlayerStats() {
        playerHP = -1;
        playerDefense = -1;
        playerSTR = -1;
        playerDEX = -1;
        playerAGL = -1;
        playerINT = -1;
        playerFTH = -1;
        playerLuck = -1;
    }

    public void setPlayerHP(int hp) {
        playerHP = hp;
    }

    public int getPlayerHP() {
        return  playerHP;
    }

    public void setPlayerSTR(int str) {
        playerSTR = str;
    }

    public int getPlayerSTR() {
        return  playerSTR;
    }

    public void setPlayerDEX(int dex) {
        playerDEX = dex;
    }

    public int getPlayerDEX() {
        return  playerDEX;
    }

    public void setPlayerAGL(int agl) {
        playerAGL = agl;
    }

    public int getPlayerAGL() {
        return  playerAGL;
    }
}