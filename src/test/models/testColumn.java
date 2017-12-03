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
    public void testRemove() {
        Columns col = new Columns();
        Card c = new Card(14,Suit.Hearts);
        col.addCard(c, 1);
        col.addCard(c, 2);
        col.remove(1);
        Assert.assertNotEquals(col.columnSize(1), col.columnSize(2));

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

    @Test
    public void testMove() {
        Columns col = new Columns();
        Card c = new Card(14, Suit.Clubs);
        col.addCard(c, 2);
        col.move(2, 1);
        Card d = col.getTopCard(2);
        Card e = col.getTopCard(1);
        Assert.assertNotEquals(d, e);
    }

}
