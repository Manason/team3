package models;

import java.util.ArrayList;
import java.util.Collections;

public class EnglishDeck extends Deck{


    //constructor for deck, initializes deck
    public EnglishDeck() {

        for (int i = 2; i < 15; i++) {
            deck.add(new Card(i, Suit.Clubs));
            deck.add(new Card(i, Suit.Hearts));
            deck.add(new Card(i, Suit.Diamonds));
            deck.add(new Card(i, Suit.Spades));
        }
    }
}