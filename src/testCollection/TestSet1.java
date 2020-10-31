package testCollection;

import java.util.HashSet;
import java.util.Set;

public class TestSet1 {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("Hello");
        s.add("World");
        s.add(new Name("Tom", "Jim"));
        s.add(new Integer(100));
        s.add(new Integer(100));
        s.add(100);
        s.add(200);
        s.add(200);
        s.add("Hello");
        s.add(new String("Hello"));
        s.add(new Name("Tom", "Jim"));

        System.out.println(s);  //[Tom Jim, Hello, 100, 200, World],相同的(被判定为equals的)元素不会被加入
    }
}
