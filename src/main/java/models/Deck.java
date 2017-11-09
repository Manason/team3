package models;

import java.util.Collections;
import java.util.ArrayList;

public class Deck {

    public java.util.List<Card> deck = new ArrayList<>();

    //constructor for deck, initializes deck
    public Deck() {

        for (int i = 2; i < 15; i++) {
            deck.add(new Card(i, Suit.Clubs));
            deck.add(new Card(i, Suit.Hearts));
            deck.add(new Card(i, Suit.Diamonds));
            deck.add(new Card(i, Suit.Spades));
        }
    }

    //shuffles the deck
    public void shuffle() {

        System.out.println("Shuffling Cards...");
        Collections.shuffle(deck);
        System.out.println("Cards have been shuffled!");
    }

    //returns the size of the deck, so total number of cards left
    public int getSize() {

        return deck.size();
    }

    //draws a card and removes a card from teh deck ArrayList
    public Card draw() {

        Card drawnCard = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return drawnCard;
    }
}
