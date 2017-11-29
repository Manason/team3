package models;

public class SpanishDeck extends Deck {

    public SpanishDeck(){
        //initialize spanish deck
        for(int i = 1; i < 12; i++) {
            deck.add(new Card(i, Suit.Bastos));
            deck.add(new Card(i, Suit.Oros));
            deck.add(new Card(i, Suit.Copas));
            deck.add(new Card(i, Suit.Espadas));
        }
        //add two jokers
        deck.add(new Card(13, Suit.Joker));
        deck.add(new Card(13, Suit.Joker));
    }
}
