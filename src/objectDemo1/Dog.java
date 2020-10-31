package objectDemo1;

public class Dog {
    static int age;

    void run() {
        System.out.println("年龄为" + age + "的狗在跑");
    }

    String catchMouse() {
        Mouse m1 = new Mouse();
        m1.color = "black";

        return m1.run() + "，年龄为" + age + "的狗正在抓老鼠";
    }

    public static void main(String[] args) {
        System.out.println(age + 1);    //成员变量会被默认初始化
        Dog d1 = new Dog();
        d1.age = 5;
        d1.run();
        String d1CatchMouse = d1.catchMouse();
        System.out.println(d1CatchMouse);
    }
}

class Mouse {
    String color;
    String run() {
        return  "颜色为" + color + "的老鼠在跑";
    }
}