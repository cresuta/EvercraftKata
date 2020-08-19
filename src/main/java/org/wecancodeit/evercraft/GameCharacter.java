package org.wecancodeit.evercraft;

import java.util.Random;

public class GameCharacter {

    private String name;
    private Alignment alignment;
    private int armorClass = 10;
    private int hitPoints = 5;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String attackHit() {
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
