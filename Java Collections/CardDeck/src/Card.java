import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank) {
    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage(){
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    public static Card getNumbericCard(Suit suit, int cardNumber) {
        if(1 < cardNumber && 11 > cardNumber){
            return new Card(suit, String.valueOf(cardNumber), cardNumber-2);
        }else{
            return null;
        }
    }

    public static Card getFaceCard(Suit suit, char abbr) {
        int charIndex = "JQKA".indexOf(abbr);
        if(charIndex > -1) {
            return new Card(suit, "" + abbr, charIndex + 9);
        }
        System.out.println("Invalid face card selected.");
        return null;
    }

    public static List<Card> getStandardDeck() {
        List<Card> cardList = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int j = 2; j < 10; j++) {
                cardList.add(getNumbericCard(suit, j));
            }
            for(char c : new char[]{'J', 'Q', 'K', 'A'}){
                cardList.add(getFaceCard(suit, c));
            }
        }
        return cardList;
    }
}
