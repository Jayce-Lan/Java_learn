package testCollection;

import java.util.Collection;
        import java.util.HashSet;
        import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new Name("Tom", "Jim"));
        c.add(new Name("Tim", "Jim"));
        c.add(new Name("Tbm", "Jim"));
        c.add(new Name("Rose", "Sam"));

        Iterator it = c.iterator();

        while (it.hasNext()) {
            Name n = (Name) it.next();
            System.out.println(n.getFirstName());
        }
    }
}
