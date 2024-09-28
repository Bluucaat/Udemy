package challenge.blackjack;

import challenge.model.BlackJackCard;
import challenge.model.Hand;

public class GameManager {
    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public void startGame() {
        Hand playerHand = new Hand(game.getDeck());
        System.out.println(playerHand);
        drawCard(playerHand);
        System.out.println(playerHand);
        //TODO
    }

    private void drawCard(Hand hand) {
        BlackJackCard card = game.getDeck().drawCard();
        if (card != null) {
            hand.addCard(card);
        }
    }
}
