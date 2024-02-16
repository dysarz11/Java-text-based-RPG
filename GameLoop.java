import java.util.Random;
import java.util.Scanner;

public class GameLoop {
    private int playerSTR;
    private int playerDEX;
    private int playerAGL;

    private int enemySTR;
    private int enemyDEX;
    private int enemyAGL;
    private int playerDamage;
    private int enemyDamage;
    private void PullStats(PlayerStats playerStats, EnemyStats enemyStats) {
        playerSTR = playerStats.getPlayerSTR();
        playerDEX = playerStats.getPlayerDEX();
        playerAGL = playerStats.getPlayerAGL();

        enemySTR = enemyStats.getEnemySTR();
        enemyDEX = enemyStats.getEnemyDEX();
        enemyAGL = enemyStats.getEnemyAGL();
    }
    public void combatLoop(PlayerStats playerStats, EnemyStats enemyStats, Attack attack, Random rand, Dice dice, Scanner kb, LevelSystem levelSystem) {
        int playerHP = playerStats.getPlayerHP();
        int enemyHP = enemyStats.getEnemyHP();

        PullStats(playerStats, enemyStats);
        do {
            System.out.println("Player attack");
            this.playerDamage = attack.attackResult(playerSTR, playerDEX, playerAGL, rand, dice);
            System.out.println("You did " + playerDamage + " damage!\n");
            enemyHP -= playerDamage;

            System.out.println("Enemy attack");
            this.enemyDamage = attack.attackResult(enemySTR, enemyDEX, enemyAGL, rand, dice);
            System.out.println("The enemy did " + enemyDamage + " damage!\n");
            playerHP -= enemyDamage;
        } while (playerHP > 0 && enemyHP > 0);

        if (playerHP > 0) {
            int newXP = rand.nextInt(3) + 1;
            levelSystem.addXP(newXP);
            System.out.println("Enemy is dead, You win!");
            System.out.println("You gained " + newXP + "XP!");
            System.out.println("Total XP: " + levelSystem.getXP());
        }
        else {
            System.out.println("You died");
        }
    }
}