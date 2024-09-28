package challenge.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<BlackJackCard> deck = BlackJackCard.genBJDeck();


    public void shuffle(){
        Collections.shuffle(deck);
    }
    public BlackJackCard drawCard(){
        if (deck.isEmpty()) {
            throw new IllegalStateException("No cards left in the deck");
        }
        return deck.removeLast();
    }
}
