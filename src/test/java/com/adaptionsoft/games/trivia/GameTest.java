package com.adaptionsoft.games.trivia;

import static junit.framework.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.adaptionsoft.games.uglytrivia.Game;
import com.adaptionsoft.games.uglytrivia.GameInterface;
import com.adaptionsoft.games.uglytrivia.OriginalGame;

public class GameTest {

    private String SOME_PLAYER = "Robert";
    private ByteArrayOutputStream outputStream;
    private Game game;
    private OriginalGame originalGame;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        game = new Game();
        originalGame = new OriginalGame();
    }

    @Test
    public void whenANewGameNothingHappens() {
        // given

        // when
        new Game();

        // then
        assertEquals("", outputStream.toString());
    }

    @Test
    public void whenAPlayerIsAddedToAGameNameAndNumberOfPlayerIsDisplayed() {
        // given
        originalGame.add(SOME_PLAYER);
        final String originalGameOutput = outputStream.toString();

        // when
        outputStream.reset();
        game.add(SOME_PLAYER);
        final String gameOutputStream = outputStream.toString();
        // then
        assertEquals(originalGameOutput, gameOutputStream);

    }

    @Test
    public void whenAGameIsPlayedSomeTextIsDisplayed() {
        // given
        final long seed = System.currentTimeMillis();
        aGameIsPlayed(originalGame, seed);
        final String originalGameOutput = outputStream.toString();
        // when
        outputStream.reset();
        aGameIsPlayed(game, seed);
        final String gameOutputStream = outputStream.toString();
        // then
        assertEquals(originalGameOutput, gameOutputStream);

    }

    private void aGameIsPlayed(GameInterface aGame, long seed) {
        boolean notAWinner;

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        Random rand = new Random(seed);

        do {

            aGame.roll(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                notAWinner = aGame.wrongAnswer();
            } else {
                notAWinner = aGame.wasCorrectlyAnswered();
            }

        } while (notAWinner);

    }

}
