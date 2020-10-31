package testCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestList3 {
    public static void main(String[] args) {
        String str = "Hello World!";
        String[] strArr = str.split("");

        List l = new LinkedList();

        for (int i = 0; i < strArr.length; i++) {
            l.add(strArr[i]);
        }

        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
