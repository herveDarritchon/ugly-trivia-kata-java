package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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

    private class TestableConsole implements Console {

	    @Override public List<String> getMessages() {
            return messages;
        }

        private List<String> messages = new ArrayList<>();

        @Override public void display(Object message) {
            messages.add(message.toString());
        }

    }

}
