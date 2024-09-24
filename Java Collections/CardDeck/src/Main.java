import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = Card.getStandardDeck();
        Card.printDeck(cards);

        Card[] cardArray = new Card[13];
        Card aceOfHeart = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHeart);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Heart", 2);

        List<Card> cards2 = new ArrayList<>(52);
        Collections.fill(cards2, aceOfHeart);
        System.out.println(cards2);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 2);

        Collections.addAll(cards2, cardArray);
        Collections.addAll(cards2, cardArray);
        Card.printDeck(cards2, "Card collection with Aces added", 2);

        Collections.copy(cards2, kingsOfClubs);
        Card.printDeck(cards2, "Card collection with Kings copied", 2);

        cards2 = List.copyOf(kingsOfClubs);
        Card.printDeck(cards2, "List copy of Kings of club", 2);

    }
}
