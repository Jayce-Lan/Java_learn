package testCollection;

import java.util.ArrayList;
import java.util.Collection;

//容器

public class TestCollection1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //可以放不同对象
        c.add("Hello");
        c.add(new Name("Tom", "Ben"));
        c.add(new Integer(1000));

        System.out.println(c.size());
        System.out.println(c);  //会输出每个对象中的toString方法
    }
}