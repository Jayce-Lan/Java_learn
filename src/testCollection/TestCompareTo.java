package testCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @类和对象的排序
 * 类和对象本身无法排序，
 * 但是在对象中接入Comparable接口，并重写其compareTo方法即可实现排序
 */

public class TestCompareTo {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add(new Name("Tom", "Om"));
        l.add(new Name("Yuu", "Jim"));
        l.add(new Name("Tony", "Jom"));
        l.add(new Name("Tommy", "Om"));

        System.out.println(l);

        //由于重写了compareTo,因此可以实现sort的排序
        Collections.sort(l);
        System.out.println(l);
    }
}
