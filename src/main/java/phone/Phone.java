package phone;

import java.util.*;

abstract class Phone implements PhoneInterface {
    Contact Contact;
    protected String serviceProvider;
    protected String myPhoneNumber;
   // protected TreeSet<Contact> Contacts;

    public Phone( String serviceProvider, String myPhoneNumber) {
        this.serviceProvider = serviceProvider;
        this.myPhoneNumber = myPhoneNumber;

    }

//    public TreeSet<Contact> addContact(Contact contact) {
//        Contacts.add(contact);
//        return Contacts;
//    }

//    public Contact getFirstContact(LinkedList contacts){
//        return (phone.Contact) contacts.get(0);
//   }
}
