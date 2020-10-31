package objectDemo1.method1;

/**
 * 构造方法
 * 构造方法创建的对象最后都会由栈内存存入堆内存
 */
public class Person {
    int age = 20;
    int id;

    Person(int _age, int _id) {
        age = _age;
        id = _id;
    }

    public static void main(String[] args) {
        Person tom = new Person(24, 1);
        Person tony = new Person(25, 2);
        Person jack = new Person(24, 1);
        System.out.println(tom == jack);    //false
    }
}
