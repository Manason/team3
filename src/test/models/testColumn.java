package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testColumn {

    @Test
    //
    public void testAddCard() {
        Card c = new Card(14, Suit.Hearts);
        Columns col = new Columns();

    }

    @Test
    public void testColumnSize() {

    }
    @Test
    public void testColumnHasCards(){
        Columns col = new Columns();
        Card c = new Card(14, Suit.Clubs);
        col.addCard(c, 1);
        assertEquals(true, col.columnHasCards(1));
    }

    @Test
    public void testGetTopCard(){
        Columns col = new Columns();
        Card c = new Card(14, Suit.Clubs);
        col.addCard(c, 2);
        Card d = col.getTopCard(2);
        assertEquals(d, c);
    }

}
