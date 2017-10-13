package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Assignment 1: Each of the blank methods below require implementation to get AcesUp to build/run
 */
public class Game {

    public java.util.List<Card> deck = new ArrayList<>();

    public java.util.List<java.util.List<Card>> cols = new ArrayList<>(4);


    public Game(){
        // initialize a new game such that each column can store cards
        for(int i = 0; i < 4; i++){
            cols.add(new ArrayList<Card>(13));
        }
    }

    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle() {
        // shuffles the deck so that it is random

        System.out.println(" Shuffling cards...."); // let the user know that the cards are shuffling
        Collections.shuffle(deck); // shuffle the cards with the "shuffle" function from the collections class
        System.out.println("Cards have been shuffled!"); // let the user know that the cards have been shuffled
    }

    public void dealFour() {
        // remove the top card from the deck and add it to a column; repeat for each of the four columns
		if(deck.size() > 0){
			for(int i = 0; i < 4; i++){
				Card drawnCard = deck.get(deck.size()-1);
				deck.remove(deck.size()-1);
				cols.get(i).add(drawnCard);
			}
		}
    }

    public void remove(int columnNumber) {
        // remove the top card from the indicated column
        if (cols.get(columnNumber).size() > 0) {
            cols.get(columnNumber).remove(cols.get(columnNumber).size()-1);
        }
    }

    private boolean columnHasCards(int columnNumber) {
        // check indicated column for number of cards; if no cards return false, otherwise return true
    	if (cols.get(columnNumber).size() > 0) {
            return true;
        }
        return false;
    }

    private Card getTopCard(int columnNumber) {
        return this.cols.get(columnNumber).get(this.cols.get(columnNumber).size()-1);
    }

 // remove the top card from the columnFrom column, add it to the columnTo column
    public void move(int columnFrom, int columnTo) {

        //check if columnFrom is empty, if it's empty, give error; else, run code
        if (columnHasCards(columnFrom) && !columnHasCards(columnTo)) {

            Card topCard = cols.get(columnFrom).get(cols.get(columnFrom).size()-1);
            cols.get(columnFrom).remove(cols.get(columnFrom).size()-1);
            cols.get(columnTo).add(topCard);

        } else {
            System.out.println("Check piles!");
        }
    }

    private void addCardToCol(int columnTo, Card cardToMove) {
        cols.get(columnTo).add(cardToMove);
    }

    private void removeCardFromCol(int colFrom) {
        this.cols.get(colFrom).remove(this.cols.get(colFrom).size()-1);
    }
}
