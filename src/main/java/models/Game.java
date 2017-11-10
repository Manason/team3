package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Assignment 1: Each of the blank methods below require implementation to get AcesUp to build/run
 */
public class Game {

    public Deck deck;
    public java.util.List<Column> cols;
    public int score;


    public Game(){
        resetGame();
    }

    //resets the game to it's initial state so that a new round can be played
    public void resetGame() {
        deck = new Deck();
        cols = new java.util.List<Column>(4);
        score = 0;
    }

    //removes the top card from the col number starting from 0
    public void removeCard(int colNumber){
        cols.get(colNumber).removeCard();
    }


    //deals four cards to each of the columns from the deck
    public void dealFour() {
        if (deck.getSize() > 0) {
            for (int i = 0; i < 4; i++) {
                cols.get(i).addCard(deck.deal());
            }
        }
    }


    public void removeCard(int columnNumber) {
        if(cols.get(columNumber).getSize() > 0){

        }
        // remove the top card from the indicated column
        if (columnHasCards(columnNumber)) {
           for(int i = 0; i < 4; i++) {
               if (columnHasCards(i)) {
                   if ((getTopCard(columnNumber).getSuit().equals(getTopCard(i).getSuit())) && (getTopCard(columnNumber).getValue() < getTopCard(i).getValue())) {
                       cols.get(columnNumber).remove(getTopCard(columnNumber));
                       break;
                   }
               }
           }
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
