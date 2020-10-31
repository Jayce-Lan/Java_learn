package superDemo.test;

public class TestB extends TestA {
    TestB() {
        print("TestB()");
    }

    public void f() {
        print("TestB: f()");
    }

    public static void main(String[] args) {
        /**
         * @创建tb的时候会先创建一个无参的TestA(),随后打印;再者才会打印TestB()
         * 在打印完必后调用被TestB重写的f()
         */
        TestB tb = new TestB();
        tb.f();

        /**
         * @输出结果
         * TestA()
         * TestB()
         * TestB: f()
         */
    }
}

class TestA {
    public void print(String str) {
        System.out.println(str);
    }

    TestA() {
        print("TestA()");
    }

    public void f() {
        print("TestA: f()");
    }
}
