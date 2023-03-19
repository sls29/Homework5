package phone;

import java.util.LinkedList;
import java.util.TreeSet;

public class Galaxy6 extends Samsung {

    private String IMEI;

    public Galaxy6(String serviceProvider, String myPhoneNumber,
                   String phoneColor, Double batteryLife, String IMEI) {
        super(serviceProvider, myPhoneNumber, phoneColor, batteryLife);

        this.IMEI = IMEI;
    }


    public void addContact() {
            }

    public void sendMessage() {
    }

    public void call() {
    }

    public void callHistory() {
    }
}


