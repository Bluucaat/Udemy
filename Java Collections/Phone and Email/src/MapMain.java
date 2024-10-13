import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("-".repeat(20));

        Map<String, Contact> contacts = new HashMap<>();
        for(Contact contact : fullList) {
            contacts.put(contact.getName(), contact);
        }
        //map actually replaces elements if one with a key already exists
        contacts.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("-".repeat(20));
        System.out.println(contacts.get("Charlie Brown"));

        System.out.println(contacts.get("Chuck"));
        Contact defaultContact = new Contact("Chuck");
        System.out.println(contacts.getOrDefault("Chuck", defaultContact));

        contacts.clear();

        for(Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if(duplicate != null) {
                System.out.println("Duplicate contact: " + duplicate.getName());
                System.out.println("Current contact: " + contact.getName());
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("-".repeat(20));
        contacts.clear();

        for(Contact contact : fullList) {
            //if the entry isn't being added for the first time, it won't be replaced
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("-".repeat(20));
        contacts.clear();

        for(Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if(duplicate != null) {
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("-".repeat(20));
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
                Contact::mergeContactData));

        contacts.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("-".repeat(20));
        for(String contactName : new String[]{"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
            contacts.computeIfAbsent(contactName, k -> new Contact(k));
        }
        contacts.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("-".repeat(20));
        for(String contactName : new String[]{"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}){
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmail("Fun Place"); return v;
            });
        }
        contacts.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("-".repeat(20));
        contacts.replaceAll((k, v) -> {
            String newEmail = k.replaceAll(" ", "") + "@funplace.com";
            v.replaceEmailIfExists("DDuck@funplace.com", newEmail);
            return v;
        });
        contacts.forEach((k, v) -> System.out.println(k + ": " + v));
        Contact daisy = new Contact("Daisy Jones Duck", "daisyj@duck.com");
        Contact replacedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println(daisy  + " replaced by: " + replacedContact);

        System.out.println("-".repeat(20));
        Contact updatedDaisy = replacedContact.mergeContactData(daisy);
        System.out.println(updatedDaisy + " updated");
        boolean success = contacts.replace("Daisy Duck", replacedContact,
                daisy);
        if(success) {
            System.out.println("THe code succesfully replaced the element");
        }else{
            System.out.println("Did not match on both key, and value, not replaced.");
        }
        System.out.println("-".repeat(20));
        success = contacts.remove("Daisy Duck", daisy);
        if(success) {
            System.out.println("THe code succesfully removed the element");
        }else{
            System.out.println("Did not match on both key, and value, not removed.");
        }
    }
}
