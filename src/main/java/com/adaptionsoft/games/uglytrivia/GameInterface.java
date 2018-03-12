package com.adaptionsoft.games.uglytrivia;

/**
 * Created by Hervé Darritchon on 12/03/2018.
 */
public interface GameInterface {
    String createRockQuestion(int index);

    boolean isPlayable();

    boolean add(String playerName);

    int howManyPlayers();

    void roll(int roll);

    boolean wasCorrectlyAnswered();

    boolean wrongAnswer();
}
