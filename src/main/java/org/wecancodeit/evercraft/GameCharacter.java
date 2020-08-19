package org.wecancodeit.evercraft;

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

}
