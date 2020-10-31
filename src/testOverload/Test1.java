package testOverload;

/**
 * 方法的重载
 * 同一个类中定义一样名字的方法，但是参数不同（个数/类型）
 */
public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person(0, 20);
        Person p2 = new Person( 30);
        Person p3 = new Person();
        int age = 16;
        p3.setAge(age);
    }
}

class Person {
    int id, age;

    Person() {
        id = 0;
        age = 25;
        System.out.println(id + ", " + age);
    }

    Person(int _age) {
        id = 1;
        age = _age;
        System.out.println(id + ", " + age);
    }

    Person(int _id, int _age) {
        id = _id;
        age = _age;
        System.out.println(id + ", " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}