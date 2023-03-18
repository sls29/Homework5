package phone;

public class Message {
    public String message;
    public final int messageMaxLength = 100;
    String MessageTime;
    Contact contact;


    public Message (String message, Contact contact){
        this.message = message;
        this.contact = contact;
    }
}
