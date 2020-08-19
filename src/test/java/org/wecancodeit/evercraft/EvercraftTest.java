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
}
