import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos =
                Arrays.asList(aText, bText, cText, dText, eText);

        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));
        //sets allow anything in the constructor which is an instance implementing collections
        Set<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet: " + mySet);
        System.out.println("# of elements: " + mySet.size());

        for(String setValue : mySet) {
            System.out.println(setValue + ": ");
            for(int i = 0; i<hellos.size(); i++) {
                if(setValue == (hellos.get(i))) {
                    System.out.println("equal to: " + i);
                }
                else{
                    System.out.println("not equal to: " + i);
                }
            }
        }
        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingOfClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenOfSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> cards = Arrays.asList(aceHearts, kingOfClubs, queenOfSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCard> deck = new HashSet<>(cards);
        System.out.println(deck);

        /* hashset will check hashcodes when comparing elements, equals is
        only called if the bucket identifier is the same
         */
    }
}