package phone;

import java.util.Comparator;

public class OrdComparator implements Comparator<Contact> {
    public int compare(Contact c1, Contact c2){
        if(c1.ordNumber > c2.ordNumber) {
            return -1;
        } else if (c1.ordNumber == c2.ordNumber) {
            return 0;
        } else  {
            return 1;
        }
    }
}
