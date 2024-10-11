import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

//        NavigableSet<Contact> sorted = new TreeSet<>(phones);
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);

        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        //takes the navigableset's comparator
        fullList.sort(sorted.comparator());
        fullList.forEach(System.out::println);

        //perhaps found in legacy code
        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());

        //preferred
        Contact min2 = fullSet.first();
        Contact max2 = fullSet.last();

        System.out.printf("Min:%s, Max:%s\n", min, max);
        System.out.printf("Min:%s, Max:%s\n", min2, max2);

        //returns element, then removes
        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First element = " + copiedSet.pollFirst());
        System.out.println("Last element = " + copiedSet.pollLast());
        copiedSet.forEach(System.out::println);

        Contact daffy = new Contact("Daffy duck");
        Contact daisy = new Contact("Daisy Duck");
        Contact snoopy = new Contact("Snoopy");
        Contact archie = new Contact("Archie");

        for (Contact c : List.of(daffy, daisy, max2, snoopy)) {
            //equals to value passed
            System.out.printf("ceiling(%s)=%s%n", c.getName(), fullSet.ceiling(c));
            //next greater element
            System.out.printf("higher(%s)=%s%n", c.getName(), fullSet.higher(c));
        }
        System.out.println("-".repeat(20));

        for (Contact c : List.of(daffy, daisy, min2, archie)) {
            //equals to value passed
            System.out.printf("floor(%s)=%s%n", c.getName(), fullSet.floor(c));
            //next greater element
            System.out.printf("lower(%s)=%s%n", c.getName(), fullSet.lower(c));
        }
        System.out.println("-".repeat(20));

        //backed by original set
        NavigableSet<Contact> descendingSet = fullSet.descendingSet();
        descendingSet.forEach(System.out::println);
        System.out.println("-".repeat(20));

        Contact lastContact = descendingSet.pollLast();
        System.out.println("removed: " + lastContact);
        descendingSet.forEach(System.out::println);
        System.out.println("-".repeat(20));
        fullSet.forEach(System.out::println);
        System.out.println("-".repeat(20));

        //exclusive, unless overridden
        Contact marion = new Contact("Maid Marion");
        var headSet =  fullSet.headSet(marion, true);
        headSet.forEach(System.out::println);
        System.out.println("-".repeat(20));


        var tailSet =  fullSet.tailSet(marion, false);
        tailSet.forEach(System.out::println);
        System.out.println("-".repeat(20));

        //includes first, excludes last. can be overloaded.
        Contact linus = new Contact("Linus");
        var subset = fullSet.subSet(linus, false, marion, true);
        subset.forEach(System.out::println);
        System.out.println("-".repeat(20));
    }
}
