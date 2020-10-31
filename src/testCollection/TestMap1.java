package testCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new TreeMap();

        //put:将指定的值与此映射中的指定键关联
        m1.put("one", new Integer(1));
        m1.put("two", new Integer(2));
        m1.put("three", new Integer(3));

        m2.put("A", new Integer(1));
        m2.put("B", new Integer(2));

        System.out.println(m1.size());

        //containsKey:寻找对应的键是否存在
        System.out.println(m1.containsKey("one"));
        //containsValue:寻找对应的值是否存在
        System.out.println(m2.containsValue(2));

        System.out.println(m2.get("B"));

        if (m1.containsKey("two")) {
            //返回指定的键映射的值，或 null如果这个Map不包含的键映射
            int i = ((Integer)m1.get("two")).intValue();
            System.out.println(i);
        }

        Map m3 = new HashMap();
        m3.putAll(m2);
        System.out.println(m3);
    }
}
