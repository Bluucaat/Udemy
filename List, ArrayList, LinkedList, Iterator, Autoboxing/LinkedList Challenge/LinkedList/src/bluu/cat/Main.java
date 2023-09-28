package bluu.cat;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {

    static final String options = """
            Aviable actions (select word or letter):
            (F)orward
            (B)ackward
            (L)ist Places
            (Q)uit
            """.strip();

    public static void main(String[] args) {


        LinkedList<Place> townList = new LinkedList<>();

        addPlace(townList, new Place("Adelaide", 1374));
        addPlace(townList, new Place("Brisbane", 917));
        addPlace(townList, new Place("Perth", 3923));
        addPlace(townList, new Place("Alice Springs", 2771));
        addPlace(townList, new Place("Darwin", 3972));
        addPlace(townList, new Place("Melbourne", 877));
        ;
        var iterator = townList.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;


        while (!quitLoop) {
            System.out.println(options);

            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            String input = sc.nextLine();

            switch (input.toUpperCase().charAt(0)) {
                case 'F' -> {
                    if (iterator.hasNext()) {
                        System.out.println("The next place is: " + iterator.next());
                    }
                }
                case 'B' -> {
                    if (iterator.hasPrevious()) {
                        System.out.println("The previous place is: " + iterator.previous());
                    }
                }
                case 'L' -> System.out.println(townList);
                case 'Q' -> {
                    System.out.println("Quitting...");
                    return;
                }
                default -> quitLoop = true;
            }
            System.out.println();
        }


    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("The given place already exists!");
            return;
        }
        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
}
