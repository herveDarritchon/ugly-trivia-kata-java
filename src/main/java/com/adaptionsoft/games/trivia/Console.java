package com.adaptionsoft.games.trivia;

import java.util.List;

/**
 * Created by Hervé Darritchon on 08/03/2018.
 */
public interface Console {
    void display(Object message);
    List<String> getMessages();
}
