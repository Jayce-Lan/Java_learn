package testCollection;

import java.util.Collection;
import java.util.HashSet;

public class BasicContainer {
    public static void main(String[] args) {
        Collection c = new HashSet();

        c.add("Hello");
        c.add(new Integer(100));
        c.add(new Name("J", "L"));

        c.remove("Hello");
        c.remove(100);

        System.out.println(c.remove(new Name("J", "L")));

        System.out.println(c.size());
        System.out.println(c);
    }
}
