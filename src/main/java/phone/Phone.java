package phone;

import java.util.*;

abstract class Phone implements PhoneInterface {
    protected String serviceProvider;
    protected String myPhoneNumber;

    public Phone(String serviceProvider, String myPhoneNumber) {
        this.serviceProvider = serviceProvider;
        this.myPhoneNumber = myPhoneNumber;
    }

    public void addContact(Contact contact) {
    }

    public void getFirstContact(Contact contact){
   }

   public void sendMessage(Contact contact){
   }

    public void call(Contact contact){
    }
}
