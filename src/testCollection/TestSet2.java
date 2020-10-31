package testCollection;

import java.util.HashSet;
import java.util.Set;

public class TestSet2 {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        Set s2 = new HashSet();
        s1.add("a");    s1.add("b");    s1.add("c");
        s2.add("a");    s2.add("b");    s2.add("d");

        Set sn = new HashSet(s1);   //拷贝s1的所有元素
        sn.retainAll(s2);   //求su与s2的交集

        System.out.println(sn); //[a, b]

        Set su = new HashSet(s1);
        su.addAll(s2);      //求合集

        System.out.println(su); //[a, b, c, d]
    }
}
