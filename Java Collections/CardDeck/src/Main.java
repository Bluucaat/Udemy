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

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled deck", 4);

        Collections.reverse(deck);
        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Sorted deck", 13);
        Collections.reverse(deck);
        Card.printDeck(deck, "Reverse deck", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings", 2);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "Tens", 2);

        //if sublist found gives index
        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println(subListIndex);
        System.out.println("Contains = "  + deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck, kings);
        System.out.println("disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(tens, kings);
        System.out.println("disjoint = " + disjoint2);
    }
}
