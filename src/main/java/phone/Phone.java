package phone;

import java.util.*;

abstract class Phone implements PhoneInterface {

    protected String serviceProvider;
    protected String myPhoneNumber;
    protected List<Contact> contacts = new LinkedList();

    public Phone( String serviceProvider, String myPhoneNumber) {
        this.serviceProvider = serviceProvider;
        this.myPhoneNumber = myPhoneNumber;
    }

    public void addContact(String ordNumber, String firstName, String secondName, String phoneNumber){
        System.out.println(contacts);
    }

}
