package com.adaptionsoft.games.trivia;

import static junit.framework.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.adaptionsoft.games.uglytrivia.Game;

public class GameTest {

    private String SOME_PLAYER;

    @Test
    public void whenANewGameNothingHappens() {
        // given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        // when
        new Game();

        // then
        assertEquals("", outputStream.toString());
    }

    @Test
    public void whenAPlayerIsAddedToAGameNameAndNumberOfPlayerIsDisplayed() {
        // given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        // when
        Game game = new Game();
        SOME_PLAYER = "Robert";
        game.add(SOME_PLAYER);
        // then
        assertEquals("Robert was added\n"
                + "They are player number 1\n", outputStream.toString());

    }
}
