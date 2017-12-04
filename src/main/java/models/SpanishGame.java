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
    @Override
    public void dealFour() {
        if (deck.getSize() > 0) {
            if(deck.getSize() == 2){
                cols.addCard(deck.draw(), 0);
                cols.addCard(deck.draw(), 1);
            }
            else {
                for (int i = 0; i < 4; i++) {
                    cols.addCard(deck.draw(), i);
                }
            }
        }
    }

}

