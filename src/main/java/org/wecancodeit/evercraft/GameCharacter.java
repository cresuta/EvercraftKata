package org.wecancodeit.evercraft;

import java.util.Random;

public class GameCharacter extends Ability {

    private String name;
    private Alignment alignment;
    private int armorClass = 10;
    private int hitPoints = 5;
    private int strength = 10;
    private int dexterity = 10;
    private int constitution = 10;
    private int wisdom = 10;
    private int intelligence = 10;
    private int charisma = 10;

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

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public boolean canAttack() {
        Random random = new Random();
        int opponentArmorClass = 10;
        int diceRoll = random.nextInt(20);
        if (diceRoll > opponentArmorClass) {
            return true;
        } else {
            return false;
        }
    }
}
