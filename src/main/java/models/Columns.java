package models;

import java.util.Collections;
import java.util.ArrayList;

public class Columns {
    public java.util.List<java.util.List<Card>> cols = new ArrayList<>(4);

    // Initialize each column to hold 13 cards
    public Columns(){
        // initialize a new game such that each column can store cards
        for(int i = 0; i < 4; i++){
            cols.add(new ArrayList<Card>(13));
        }
    }

    // Adds the card card to the column columnNumber.
    public void addCard(Card card, int columnNumber) {
        cols.get(columnNumber).add(card);
    }

    // remove the top card from the indicated column
    public void remove(int columnNumber) {
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
    // Gets the size of the column columnNumber
    public int columnSize(int columnNumber) {
        return cols.get(columnNumber).size();
    }

    // Determines if a column has cards
    public boolean columnHasCards(int columnNumber) {
        // check indicated column for number of cards; if no cards return false, otherwise return true
        return (columnSize(columnNumber) > 0);
    }

    // Gets the top card of a column
    public Card getTopCard(int columnNumber) {
        return cols.get(columnNumber).get(columnSize(columnNumber)-1);
    }

    // remove the top card from the columnFrom column, add it to the columnTo column
    public void move(int columnFrom, int columnTo) {

        //check if columnFrom is empty, if it's empty, give error; else, run code
        if (columnHasCards(columnFrom) && !columnHasCards(columnTo)) {

            Card topCard = getTopCard(columnFrom);
            cols.get(columnFrom).remove(cols.get(columnFrom).size()-1);
            addCard(topCard, columnTo);

        } else {
            System.out.println("Error in Move, either the columnFrom is empty or the columnTo is not empty");
        }
    }


}