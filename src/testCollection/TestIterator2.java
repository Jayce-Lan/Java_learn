package testCollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator2 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new Name("Tom", "Jim"));
        c.add(new Name("Tim", "Jim"));
        c.add(new Name("Tbm", "Jim"));
        c.add(new Name("Rose", "Sam"));

        /*for (Iterator i = c.iterator(); i.hasNext(); ) {
            Name name = (Name) i.next();
            if (name.getFirstName().length() > 3) {
                i.remove();
            }
        }*/

        Iterator i = c.iterator();
        while (i.hasNext()) {
            Name name = (Name) i.next();
            if (name.getFirstName().length() > 3) {
                i.remove();
            }
        }

        System.out.println(c);
    }
}
