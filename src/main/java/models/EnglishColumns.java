package models;

import java.util.Collections;
import java.util.ArrayList;

public class EnglishColumns extends Columns {
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

    // remove the top card from the columnFrom column, add it to the columnTo column
    public void move(int columnFrom, int columnTo) {

        //get the top card from columnFrom
        Card topCard = getTopCard(columnFrom);

        //check if top card is an ace
        if(topCard.value == 14) {

            //check if columnFrom is empty, if it's empty, give error; else, run code
            if (columnHasCards(columnFrom) && !columnHasCards(columnTo)) {


                cols.get(columnFrom).remove(cols.get(columnFrom).size() - 1);
                addCard(topCard, columnTo);

            } else {
                System.out.println("Error in Move, either the columnFrom is empty or the columnTo is not empty");
            }
        }
        else{
            System.out.println("You are only allowed to move Ace cards to empty piles!");
        }
    }
}
