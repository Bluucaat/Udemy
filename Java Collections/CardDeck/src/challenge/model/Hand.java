package challenge.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<BlackJackCard> hand;
    private int deckValue;

    public Hand(Deck deck) {
        this.hand = new ArrayList<>();
        for (int i = 0; i < 2; i++) addCard(deck.drawCard());
    }

    public void addCard(BlackJackCard card) {
        hand.add(card);
        this.deckValue += card.rank();
    }

    public boolean isBust() {
        return (this.deckValue > 21);
    }

    @Override
    public String toString() {
        return "Hand: " +
                hand +
                ", total:" + deckValue
                ;
    }
}
