package testCollection;

//Collections提供给List的一些方法

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestList2 {
    public static void main(String[] args) {
        List l1 = new LinkedList();

        for (int i = 0; i <= 9; i++) {
            l1.add("a" + i);
        }

        System.out.println(l1);

        //随机排列数组
        Collections.shuffle(l1);
        System.out.println(l1);

        //逆序数组
        Collections.reverse(l1);
        System.out.println(l1);

        //排序(升序)
        Collections.sort(l1);
        System.out.println(l1);

//        Collections.reverse(l1);
//        System.out.println(l1);


    }
}
