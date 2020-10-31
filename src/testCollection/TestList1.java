package testCollection;

import java.util.LinkedList;
import java.util.List;

public class TestList1 {
    public static void main(String[] args) {
        List l1 = new LinkedList();

        for (int i = 0; i < 5; i++) {
            l1.add("a" + i);
        }

        System.out.println(l1);

        l1.add(3, "a10");
        System.out.println(l1);

        l1.set(5, "a20");
        System.out.println(l1);

        System.out.println(l1.get(3));
        System.out.println(l1.indexOf("a4"));
        System.out.println(l1.remove(1));

        l1.remove("a3");
        System.out.println(l1);
    }
}
