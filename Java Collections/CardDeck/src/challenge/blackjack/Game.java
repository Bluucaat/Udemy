package challenge.blackjack;

import challenge.model.Deck;

public class Game {
    private Deck deck;

    public Game() {
        this.deck = new Deck();
        deck.shuffle();
    }

    public Deck getDeck() {
        return deck;
    }

    public static void main(String[] args) {
        Game game = new Game();
        GameManager gameManager = new GameManager(game);
        gameManager.startGame();
    }
}

