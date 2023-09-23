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
            (M)enu
            (Q)uit
            """.strip();

    public static void main(String[] args) {

        LinkedList<Place> townList = new LinkedList<>();

        addPlace(townList, new Place("Adelaide", 1374));
        addPlace(townList, new Place("Brisbane", 917));
        addPlace(townList, new Place("Perth", 3923));
        addPlace(townList, new Place("Alice Springs", 2771));
        addPlace(townList, new Place("Darwin", 3972));
        addPlace(townList, new Place("Melbourne", 877));;
        System.out.println(townList);




        while (true) {
            System.out.println(options);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            switch (input.toUpperCase().charAt(0)) {
                case 'F' -> System.out.println("Forward");
                case 'B' -> System.out.println("Backward");
                case 'L' -> System.out.println("List places");
                case 'M' -> System.out.println("Menu");
                case 'Q' -> {
                    System.out.println("Quitting...");
                    return;
                }
                default -> System.out.println("Unknown input");
            }
            System.out.println();
        }


    }
    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("The given place already exists!");
            return;
        }
        int matchedIndex = 0;
        for(var listPlace: list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
                matchedIndex++;
            }
        }
    }
}
