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

    Phone phone = new Galaxy6("Orange","0745121212",
            "black", 100d, "1234QWERTY5678" );


    phone.addContact(1, "Joe", "Doe", "0745232323");
    phone.addContact(1, "Joe", "Doe", "0745232323");
    phone.addContact(3, "Joy", "Dol", "0745333333");

    phone.getFirstContact();
    phone.getLastContact();

// send a message to the first contact from the previously listed

// max number of characters - 100
//        phone.getFirstMessage("phone number");
//        phone.getSecondMessage("phone number");

    phone.sendMessage("0745232323", "Call me back!");
    phone.sendMessage("0745232323", "I can't talk right now.");
    phone.sendMessage("0745131313", "I'll call you back!");

    phone.getFirstMessage("0745232323");
    phone.getSecondMessage("0745232323");


//   make a call to the second contact from the previously listed
//   phone.call("second phone number");

    phone.call("0745232323");
    phone.call("0745232323");
    phone.call("0745333333");
    phone.call("0745232323");

    phone.callHistory();

    System.out.println(" ");
    System.out.println("Phone battery level:" + phone.batteryLife);
    }
}
