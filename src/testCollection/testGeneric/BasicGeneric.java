package testCollection.testGeneric;

//泛型

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicGeneric {
    public static void main(String[] args) {
        List<String> c = new ArrayList<String>();
        c.add("aaa");   c.add("bbb");   c.add("ccc");

        Iterator<String> it = c.iterator();
        String s;

        while (it.hasNext()) {
            s = it.next();
            System.out.println(s);
        }
    }
}
