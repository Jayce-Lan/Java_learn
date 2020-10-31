package testCollection.testGeneric;

import java.util.HashMap;
import java.util.Map;

public class TestMapGeneric {
    public static void main(String[] args) {
        //泛型内是规定键-值的数据类型
        Map<String, Integer> m = new HashMap<String, Integer>();

        m.put("A", 1);
        m.put("B", 2);
        m.put("C", 3);

        System.out.println(m.size());
        System.out.println(m.containsKey("B"));

        if (m.containsKey("B")) {
            int i = m.get("B");
            System.out.println(i);
        }
        System.out.println("加载完毕");
    }
}
