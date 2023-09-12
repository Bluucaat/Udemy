package bluu.cat;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");

        placesToVisit.add(0, "Canberra");

        addMoreElements(placesToVisit);
        placesToVisit.push("Sydney");
        placesToVisit.push("Brisbane");
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary3(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.push("Toowoomba");
    }

    private static void removeMoreElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();

        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pop();
        System.out.println(p2 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved element: " + list.get(4));
        System.out.println("Last element is " + list.getLast());

        System.out.println("Darwin is at position " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position " + list.lastIndexOf("Melbourne"));
        //list.element gets the first item, because its a queue method
        System.out.println("Element from element() = " + list.element());
        //peek is a stack retrieval method
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from lastPeek() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());

        for(int i = 1; i<list.size(); i++){
            System.out.println("--> From : " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("--> From: " + previousTown + " to " + town);
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }
}



