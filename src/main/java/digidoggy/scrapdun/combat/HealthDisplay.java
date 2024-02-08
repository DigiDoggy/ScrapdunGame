package digidoggy.scrapdun.combat;

import digidoggy.scrapdun.color.Color;

public class HealthDisplay {
    private static final int MAX_HEALTH = 100;
    private static final char HEALTH_MARK = '\u2605';
    private static final char LEFT_BRACKET = '\uFD3E';
    private static final char RIGHT_BRACKET = '\uFD3F';

    public String getHealthBar(int currentHealth) {
        int starsForHealth = currentHealth * 10 / MAX_HEALTH;

        StringBuilder healthView = new StringBuilder();
        healthView.append(LEFT_BRACKET);
        for (int i = 0; i < 10; i++) {
            if (i < starsForHealth) {
                healthView.append(Color.RED); // Задаем красный цвет для текущего здоровья
                healthView.append(HEALTH_MARK);
            } else {
                healthView.append(Color.BLACK); // Задаем черный цвет для потерянного здоровья
                healthView.append(' ');
            }
        }
        healthView.append(Color.RESET); // Сброс цвета к стандартному после добавления всех звездочек
        healthView.append(RIGHT_BRACKET);

        return healthView.toString();
    }
}
