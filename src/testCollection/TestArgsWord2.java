package testCollection;

//Map集合算法，自动打包解包

import java.util.HashMap;
import java.util.Map;

public class TestArgsWord2 {
    private static final int ONE = 1;
    public static void main(String[] args) {
        Map m = new HashMap();
        for (int i = 0; i < args.length; i++) {
            int freq = (Integer) m.get(args[i]) == null ? 0 : (Integer) m.get(args[i]);
            m.put(args[i], (freq == 0 ? ONE : freq + 1));
        }

        System.out.println(m.size() + "distinct words detected: ");
        System.out.println(m);
    }
}
