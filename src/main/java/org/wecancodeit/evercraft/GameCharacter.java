package org.wecancodeit.evercraft;

import java.util.Random;

public class GameCharacter extends Ability {

    private String name;
    private Alignment alignment;
    private int armorClass = 10;
    private int hitPoints = 5;
    private Ability strength;
    private Ability dexterity;
    private Ability constitution;
    private Ability wisdom;
    private Ability intelligence;
    private Ability charisma;

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

    public Ability getStrength() {
        return strength;
    }

    public void setStrength(Ability strength) {
        this.strength = strength;
    }

    public Ability getDexterity() {
        return dexterity;
    }

    public void setDexterity(Ability dexterity) {
        this.dexterity = dexterity;
    }

    public Ability getConstitution() {
        return constitution;
    }

    public void setConstitution(Ability constitution) {
        this.constitution = constitution;
    }

    public Ability getWisdom() {
        return wisdom;
    }

    public void setWisdom(Ability wisdom) {
        this.wisdom = wisdom;
    }

    public Ability getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Ability intelligence) {
        this.intelligence = intelligence;
    }

    public Ability getCharisma() {
        return charisma;
    }

    public void setCharisma(Ability charisma) {
        this.charisma = charisma;
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
