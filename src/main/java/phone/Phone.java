package phone;

import java.util.*;

abstract class Phone implements PhoneInterface {
    Contact Contact;
    protected String serviceProvider;
    protected String myPhoneNumber;
    protected TreeSet<Contact> Contacts2 = new TreeSet<>();

    public Phone(String serviceProvider, String myPhoneNumber) {
        this.serviceProvider = serviceProvider;
        this.myPhoneNumber = myPhoneNumber;

    }

    public void addContact(Contact contact) {
        Contacts2.add(contact);

    }

//    public Contact getFirstContact(LinkedList contacts){
//        return (phone.Contact) contacts.get(0);
//   }

}
