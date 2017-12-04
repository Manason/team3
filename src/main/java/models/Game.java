package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Assignment 1: Each of the blank methods below require implementation to get AcesUp to build/run
 */
abstract class Game {

    //deck is private as only Game should be drawing from deck, score and cols need to be accessed by the view however
    private Deck deck;
    public EnglishColumns cols;

    //resets the game to it's initial state so that a new round can be played
    abstract public void resetGame();

    //deals four cards to each of the columns from the deck
    abstract public void dealFour();
}
