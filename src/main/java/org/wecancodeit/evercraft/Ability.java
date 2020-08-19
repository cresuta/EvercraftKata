package org.wecancodeit.evercraft;

public class Ability {

    private int score;
    private int modifier;

    public Ability(){}

    private Ability(int score) {
        this.score = score;
        this.modifier = (int)Math.floor((score - 5));
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }
}
