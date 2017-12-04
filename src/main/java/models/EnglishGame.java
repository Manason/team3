package models;

public class EnglishGame extends Game {

    private EnglishDeck deck;
    public EnglishColumns cols;

    public EnglishGame(){
        resetGame();
    }

    //resets the game to it's initial state so that a new round can be played
    public void resetGame() {
        deck = new EnglishDeck();
        deck.shuffle();
        cols = new EnglishColumns();
    }
    public void dealFour() {
        if (deck.getSize() > 0) {
            for (int i = 0; i < 4; i++) {
                cols.addCard(deck.draw(), i);
            }
        }
    }

}

