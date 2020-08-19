package org.wecancodeit.evercraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class EvercraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvercraftApplication.class, args);
        GameCharacter mainCharacter = new GameCharacter();
        GameCharacter opponent = new GameCharacter();
    }


    public static String attackHit() {
        Random random = new Random();
        int opponentArmorClass = 10;
        int diceRoll = random.nextInt(20);
        if (diceRoll > opponentArmorClass) {
            return "You attack first and win! You live to see fight another day.";
        } else {
            return "Opponent gets first attack. You lose.";
        }
    }
}
