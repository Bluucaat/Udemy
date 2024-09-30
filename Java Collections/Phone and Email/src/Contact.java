import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, null, 0);
    }
    public Contact(String name, long phone){
        this(name, null, phone);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        if(email != null) emails.add(email);
        String formattedPhone = String.valueOf(phone);
        formattedPhone = "(" + formattedPhone.substring(0, 3) + ") "
                                    + formattedPhone.substring(3, 6)+"-"
                                    + formattedPhone.substring(6);
        phones.add(formattedPhone);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }

    Contact mergeContactData(Contact contact){
        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }
}
