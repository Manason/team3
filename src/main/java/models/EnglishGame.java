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
        System.out.println("resetGameCall TEst");
    }
    public void dealFour() {
        System.out.println("Dealingg my dear freak frined");
        if (deck.getSize() > 0) {
            for (int i = 0; i < 4; i++) {
                cols.addCard(deck.draw(), i);
            }
        }
    }

}

