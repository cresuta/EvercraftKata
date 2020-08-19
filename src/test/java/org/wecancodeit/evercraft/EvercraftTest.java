package org.wecancodeit.evercraft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EvercraftTest {

    @Test
    public void createGameCharacterClass() {
        GameCharacter underTest = new GameCharacter();
    }
    @Test
    public void retrieveCharacterName() {
        GameCharacter underTest = new GameCharacter();
        assertNull(underTest.getName());
        underTest.setName("Cam");
        assertEquals("Cam", underTest.getName());
    }
    @Test
    public void retrieveAlignment(){
        GameCharacter underTest = new GameCharacter();
        assertNull(underTest.getAlignment());
        underTest.setAlignment(Alignment.Evil);
        assertEquals(Alignment.Evil, underTest.getAlignment());
        underTest.setAlignment(Alignment.Good);
        assertEquals(Alignment.Good, underTest.getAlignment());
        underTest.setAlignment(Alignment.Neutral);
        assertEquals(Alignment.Neutral, underTest.getAlignment());
    }
    @Test
    public void retrieveArmorDefault() {
        GameCharacter underTest = new GameCharacter();
        assertEquals(10, underTest.getArmorClass());
    }
    @Test
    public void retrieveHitPointDefault() {
        GameCharacter underTest = new GameCharacter();
        assertEquals(5, underTest.getHitPoints());
    }
    @Test
    public void chanceOfAttack() {
        GameCharacter underTest = new GameCharacter();
        underTest.attackHit();
    }

}
