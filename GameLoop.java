public class GameLoop {
    public void combatLoop(PlayerStats playerStats, EnemyStats enemyStats) {
        int playerHP = playerStats.getPlayerHP();
        int enemyHP = enemyStats.getEnemyHP();
        do {
            System.out.println("player attack");
            enemyHP--; //place holder for attacks
        } while (playerHP > 0 && enemyHP > 0);

        System.out.println("Enemy is dead");
    }
}
