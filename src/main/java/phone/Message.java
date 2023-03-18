package phone;

public class Message {
    public String message;
    public final int messageMaxLength = 100;
    String MessageTime;
    String contactNumber;


    public Message (String message, String contactNumber){
        this.message = message;
        this.contactNumber = contactNumber;
    }
}
