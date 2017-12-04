package models;

public class SpanishGame extends Game {

    private SpanishDeck deck;

    public SpanishGame(){
        resetGame();
    }

    //resets the game to it's initial state so that a new round can be played
    @Override
    public void resetGame() {
        deck = new SpanishDeck();
        deck.shuffle();
        cols = new Columns();
        score = 0;
    }

}

