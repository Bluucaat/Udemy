import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Card> cards = Card.getStandardDeck();
        cards.forEach(System.out::print);
    }
}
