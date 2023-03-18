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

    Contact contact3 = new Contact(3, "Joy", "Dol", "0745333333");
    Contacts.add(contact3);


    Iterator iterator = Contacts.iterator();
    while(iterator.hasNext()) {
        final Contact nextContact = (Contact) iterator.next();
        System.out.println(nextContact.ordNumber +") " +
                           nextContact.firstName +" " +
                           nextContact.secondName + " -> " + nextContact.phoneNumber);
    }

    System.out.println(" ");

//    phone.getFirstContact();
    System.out.println(Contacts.first().ordNumber + " " + Contacts.first().firstName +
             " " + Contacts.first().secondName + " " + Contacts.first().phoneNumber);

//    phone.getLastContact();
    System.out.println(Contacts.last().ordNumber + " " + Contacts.last().firstName +
                " " + Contacts.last().secondName + " " + Contacts.last().phoneNumber);
// send a message to the first contact from the previously listed

// max number of characters - 100

//        phone.sendMessage("phone number", "message content");

//        phone.getFirstMessage("phone number");

//        phone.getSecondMessage("phone number");

    List<Message> messages = new LinkedList<>();
    Message mess1 = new Message( "Call me back", contact1.phoneNumber);
    messages.add(mess1);

    Message mess2 = new Message( "I call you back", contact2.phoneNumber);
    messages.add(mess2);

    System.out.println(" ");
    System.out.println(mess1.message + " " + mess1.contactNumber);
    System.out.println(mess2.message + " " + mess2.contactNumber);

//   make a call to the second contact from the previously listed

//   phone.call("second phone number");

    List<Call> calls = new LinkedList<>();

    Call call1 = new Call(contact1.phoneNumber);
    calls.add(call1);

    Call call2 = new Call(contact2.phoneNumber);
    calls.add(call2);

    Call call3 = new Call(contact1.phoneNumber);
    calls.add(call3);

    Call call4 = new Call(contact3.phoneNumber);
    calls.add(call4);

    System.out.println(calls.size());
    System.out.println(messages.size());

//        phone.viewHistory();
    for(int i = 0; i < calls.size(); i++){
        System.out.println(calls.get(i).contactNumber);
    }

    }
}
