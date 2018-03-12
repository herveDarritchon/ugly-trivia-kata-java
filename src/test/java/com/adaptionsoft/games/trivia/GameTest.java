package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adaptionsoft.games.uglytrivia.Game;

public class GameTest {

	@Test
	public void true_is_true() {
		assertTrue(true);
	}

    @Test
    public void whenANewGameSomethingHappens() {
        // given
        // when
        Game game = new Game(new TestableConsole());

        // then
        final Console console = game.getConsole();
        assertTrue(console.getMessages().isEmpty());
    }

}
