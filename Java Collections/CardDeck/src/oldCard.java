import java.util.ArrayList;
import java.util.List;

public class oldCard {
    public enum cardSuit {
        C, D, H, S;
    }

    private cardSuit suit;
    private String field;
    private int rank;

    public oldCard(cardSuit suit, String field, int rank) {
        this.suit = suit;
        this.field = field;
        this.rank = rank;
    }

    public oldCard getNumericCard(cardSuit suit, int rank) {
        return new oldCard(suit,
                rank < 9? String.valueOf(rank + 2) : String.valueOf(rank),
                rank);
    }

    public oldCard getFacecard(cardSuit suit, String field) {
        return new oldCard(suit, field, rank);
    }

    public int getRank(String field) {
        try {
            return Integer.parseInt(field) - 2;
        } catch (NumberFormatException e) {
            return switch (field) {
                case "V" -> 9;
                case "Q" -> 10;
                case "K" -> 11;
                case "A" -> 12;

                default -> -1;
            };
        }
    }

    public List<oldCard> getStandardDeck() {
        List<oldCard> standardDeck = new ArrayList<oldCard>();
        //TODO
        return standardDeck;
    }

    @Override
    public String toString() {
        return
                ", field='" + field + '\'' +
                        suit +
                "(" + rank + ")";
    }
}
