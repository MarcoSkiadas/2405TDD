package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerCharacterTest {

    @BeforeEach
    void setUp() {
        // Diese Methode wird vor jedem Testfall ausgeführt
        PlayerCharacter.X = 0;
        PlayerCharacter.Y = 0;
    }
    @Test
    void getX_postionShouldBe0_whenStart5() {
        //Given
        int expected = 0;
        //when
        int actual = PlayerCharacter.getX(5);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void getY_postionShouldBe0_whenStart5() {
        //Given
        int expected = 0;
        //when
        int actual = PlayerCharacter.getY(5);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void move_shouldReturnYOneMore_whenPressW() {
        //Given
        int expected = 1;
        //when
        int actual = PlayerCharacter.move("w");
        //then
        assertEquals(expected, actual);
    }
    @Test
    void move_shouldReturnYOneLess_whenPressS() {
        //Given
        int expected = -1;
        //when
        int actual = PlayerCharacter.move("s");
        //then
        assertEquals(expected, actual);
    }
    @Test
    void move_shouldReturnXOneLess_whenPressA() {
        //Given
        int expected = -1;
        //when
        int actual = PlayerCharacter.move("a");
        //then
        assertEquals(expected, actual);
    }
    @Test
    void move_shouldReturnXOneMore_whenPressD() {
        //Given
        int expected = 1;
        //when
        int actual = PlayerCharacter.move("d");
        //then
        assertEquals(expected, actual);
    }
}