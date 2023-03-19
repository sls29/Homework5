package phone;

import java.util.LinkedList;
import java.util.TreeSet;

abstract class Samsung extends Phone {

    protected String phoneColor;


    public Samsung(String serviceProvider, String myPhoneNumber, String phoneColor, Double batteryLife) {
        super(serviceProvider, myPhoneNumber, batteryLife);

        this.phoneColor = phoneColor;


    }


}
