package testCollection;

//增强的for循环
/**
 * @缺点：不能很好的去获取数组下标
 *       不能调用集合的Iterator中的remove方法
 *       除了简单遍历并读出元素外不建议使用增强for循环
 */

import java.util.ArrayList;
import java.util.Collection;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i : arr) {
            System.out.print(i);
        }

        System.out.println();


        Collection c = new ArrayList();
        c.add(new String("aaa"));
        c.add(new String("bbb"));
        c.add(new String("ccc"));

        for (Object o : c) {
            System.out.print(o + " ");
        }
    }
}
