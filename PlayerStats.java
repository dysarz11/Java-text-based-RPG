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

    public void addPlayerHP(int playerHPIncrease) {
        this.playerHP += playerHPIncrease;
    }

    public int getPlayerHP() {
        return  playerHP;
    }

    public void setPlayerSTR(int str) {
        this.playerSTR = str;
    }

    public void addPlayerSTR(int playerSTRIncrease) {
        this.playerSTR += playerSTRIncrease;
    }

    public int getPlayerSTR() {
        return  playerSTR;
    }

    public void setPlayerDEX(int dex) {
        this.playerDEX = dex;
    }

    public void addPlayerDEX(int playerDEXIncrease) {
        this.playerDEX += playerDEXIncrease;
    }

    public int getPlayerDEX() {
        return  playerDEX;
    }

    public void setPlayerAGL(int agl) {
        this.playerAGL = agl;
    }

    public void addPlayerAGL(int playerAGLIncrease) {
        this.playerAGL += playerAGLIncrease;
    }

    public int getPlayerAGL() {
        return  playerAGL;
    }
}