package phone;

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

        phone.addContact("1", "phone number", "first name", "last name");

        phone.addContact("2", "second phone number", "second first name", "second last name");

//        phone.getFirstContact();

//        phone.getLastContact();

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
