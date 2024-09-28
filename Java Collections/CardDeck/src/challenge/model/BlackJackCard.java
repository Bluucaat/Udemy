package challenge.model;

import java.util.ArrayList;
import java.util.List;

public record BlackJackCard(Suit suit, int rank, String description){
    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;
        public char getImage(){
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {
        int index = description.equals("10") ? 2 : 1;
        String faceString = description.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    public static BlackJackCard genNumericCard(Suit suit, int rank){
        return new BlackJackCard(suit, rank, String.valueOf(rank));
    }
    public static BlackJackCard genFaceCard(Suit suit, String abbr){
        switch(abbr.toUpperCase()){
            case "J", "K", "Q":
                return new BlackJackCard(suit, 10, abbr);
            case "A":
                return new BlackJackCard(suit, 11, abbr);
            default:
                System.out.println("Incorrect card abbreviation provided");
                return null;
        }
    }
    public static List<BlackJackCard> genBJDeck(){
        List<BlackJackCard> deck = new ArrayList<>();
        for(Suit suit : Suit.values()){
            for(int i = 2; i<10; i++){
                deck.add(genNumericCard(suit, i));
        }
            for(char c : new char[]{'J', 'Q', 'K', 'A'}){
                deck.add(genFaceCard(suit, String.valueOf(c)));
                }
        }
        return deck;
    }
}

