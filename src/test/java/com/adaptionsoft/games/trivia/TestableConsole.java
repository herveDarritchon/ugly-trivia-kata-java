package com.adaptionsoft.games.trivia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hervé Darritchon on 12/03/2018.
 */
class TestableConsole implements Console {

    @Override public List<String> getMessages() {
        return messages;
    }

    private List<String> messages = new ArrayList<>();

    @Override public void display(Object message) {
        messages.add(message.toString());
    }

}
