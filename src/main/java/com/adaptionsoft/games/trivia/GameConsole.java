package com.adaptionsoft.games.trivia;

import java.util.List;

/**
 * Created by Hervé Darritchon on 08/03/2018.
 */
public class GameConsole implements Console {

    @Override public void display(Object message) {
        System.out.println(message + " was added");
    }

    @Override public List<String> getMessages() {
        throw new Error("Method should not be called");
    }

}
