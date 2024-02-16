import java.util.Random;
import java.util.Scanner;

//This program uses java 21.0.1
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        PlayerStats playerStats = new PlayerStats();
        EnemyStats enemyStats = new EnemyStats();
        GameLoop gameLoop = new GameLoop();
        Dice dice = new Dice();

        playerStats.setPlayerHP(20);
        playerStats.setPlayerSTR(3);
        playerStats.setPlayerDEX(3);
        playerStats.setPlayerAGL(4);

        enemyStats.setEnemyHP(30);
        enemyStats.setEnemySTR(5);
        enemyStats.setEnemyDEX(2);
        enemyStats.setEnemyAGL(1);

        gameLoop.combatLoop(playerStats, enemyStats);
    }
}
