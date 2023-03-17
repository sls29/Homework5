package phone;

import java.util.LinkedList;
import java.util.TreeSet;

abstract class Samsung extends Phone {

    String phoneColor;
    Double batteryLife;

    public Samsung(String serviceProvider, String myPhoneNumber, String phoneColor, Double batteryLife) {
        super(serviceProvider, myPhoneNumber);

        this.phoneColor = phoneColor;
        this.batteryLife = batteryLife;

    }
}
