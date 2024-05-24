package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerCharacterTest {

    @Test
    void getX_postionShouldBe0_whenStart5() {
        //Given
        int expected = 0;
        //when
        int actual = PlayerCharacter.getX(5);
        //then
        assertEquals(expected, actual);
    }
}