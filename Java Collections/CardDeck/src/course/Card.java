package course;
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
            for (int j = 2; j < 11; j++) {
                cardList.add(getNumbericCard(suit, j));
            }
            for(char c : new char[]{'J', 'Q', 'K', 'A'}){
                cardList.add(getFaceCard(suit, c));
            }
        }
        return cardList;
    }
    public static void printDeck(List<Card> deck){
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows){
        System.out.println("-".repeat(20));
        if(description != null){
            System.out.println(description);
        }
        int cardsInRow = deck.size()/rows;
        for(int i = 0; i < rows; i++){
            int startIndex = i*cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }
}
