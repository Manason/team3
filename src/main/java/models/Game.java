package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Assignment 1: Each of the blank methods below require implementation to get AcesUp to build/run
 */
public class Game {

    //deck is private as only Game should be drawing from deck, score and cols need to be accessed by the view however
    private Deck deck;
    public Columns cols;
    public int score;


    public Game(){
        resetGame();
    }

    //resets the game to it's initial state so that a new round can be played
    public void resetGame() {
        deck = new Deck();
        deck.shuffle();
        cols = new Columns();
        score = 0;
    }

    //deals four cards to each of the columns from the deck
    public void dealFour() {
        if (deck.getSize() > 0) {
            for (int i = 0; i < 4; i++) {
                cols.addCard(deck.draw(), i);
            }
        }
    }
    public Deck getDeck() {
        return deck;
    }

}
