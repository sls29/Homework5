package phone;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    TreeSet<Contact> Contacts = new TreeSet<>(new OrdComparator());

    Phone phone = new Galaxy6("Orange","0745121212",  "black", 100d, "1234QWERTY5678" );

    Contact contact1 = new Contact(1, "Joe", "Doe", "0745232323");
    Contacts.add(contact1);

    Contact contact2 =  new Contact(2, "John", "Dae", "0745131313");
    Contacts.add(contact2);
    //    phone.addContact(contact2);

    System.out.println(contact1.phoneNumber);
    System.out.println(contact2.firstName);
    Iterator iterator = Contacts.iterator();
    while(iterator.hasNext()) {
        final Contact nextContact = (Contact) iterator.next();
        System.out.println(nextContact.phoneNumber);
    }

    //System.out.println(Contacts.first());


//        phone.getFirstContact(LinkedList<contact>);

//    phone.getLastContact();

// send a message to the first contact from the previously listed

// max number of characters - 100

//        phone.sendMessage("phone number", "message content");

//        phone.getFirstMessage("phone number");

//        phone.getSecondMessage("phone number");

// make a call to the second contact from the previously listed

//        phone.call("second phone number");

//        phone.viewHistory();
    }
}
