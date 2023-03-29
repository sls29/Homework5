package phone;

import java.util.*;

public abstract class Phone implements PhoneInterface {
    protected String serviceProvider;
    protected String myPhoneNumber;
    protected Double batteryLife;

    public Phone(String serviceProvider, String myPhoneNumber, Double batteryLife) {
        this.serviceProvider = serviceProvider;
        this.myPhoneNumber = myPhoneNumber;
        this.batteryLife = batteryLife;
    }

    TreeSet<Contact> Contacts = new TreeSet<>(new OrdComparator());
    HashMap<String, LinkedList<String>> messageMap = new HashMap<>();
    public void listContacts() {
        for (Contact nextContact : Contacts) {
            messageMap.put(nextContact.phoneNumber, new LinkedList<>());
            System.out.println(" ");
            System.out.println(nextContact.ordNumber + ") " +
                    nextContact.firstName + " " +
                    nextContact.secondName + " -> " + nextContact.phoneNumber);
            System.out.println(" ");
        }
    }
    public void addContact(int ordNumber, String firstName, String secondName, String phoneNumber) {
    Contacts.add(new Contact(ordNumber, firstName, secondName, phoneNumber));
    System.out.println("New contact added");
    }
    public void getFirstContact(){
        System.out.println("First contact: " + Contacts.first().ordNumber + " " + Contacts.first().firstName +
                " " + Contacts.first().secondName + " " + Contacts.first().phoneNumber);
    }
    public void getLastContact(){
        System.out.println("Last contact: " + Contacts.last().ordNumber + " " + Contacts.last().firstName +
                " " + Contacts.last().secondName + " " + Contacts.last().phoneNumber);
    }
    public void sendMessage(String phoneNumber, String message){
       final int messageMaxLength = 100;
       if(message.length() < messageMaxLength) {
           LinkedList<String> list = messageMap.get(phoneNumber);
           list.add(message);
           messageMap.put(phoneNumber, list);
           System.out.println(list.size());
           System.out.println("Message send.");
           this.batteryLife -= 1;
       } else {
           System.out.println("Message too long");
       }
    }
    public void getFirstMessage(String phoneNumber){
        LinkedList<String> list = messageMap.get(phoneNumber);
        System.out.println("First message for: " + phoneNumber);
        System.out.println(list.getFirst());
        System.out.println(" ");
    }

    public void getSecondMessage(String phoneNumber){
      LinkedList<String> list = messageMap.get(phoneNumber);
      List<String> newList = new ArrayList<>(list);
      System.out.println("Second message for: " + phoneNumber);
      System.out.println(newList.get(1));
      System.out.println(" ");
    }

    List<Call> calls = new LinkedList<>();
    public void call(String phoneNumber){
        calls.add(new Call(phoneNumber));
        this.batteryLife -= 2;
    }

    public void callHistory(){
        System.out.println(" ");
        System.out.println("Call history");
        for (Call call : calls) {
            System.out.println(call.contactNumber);
        }
    }
}
