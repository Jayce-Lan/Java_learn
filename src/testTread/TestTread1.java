package testTread;

//多线程：线程，是一个程序内部不同的执行路径

public class TestTread1 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
        m3();
    }

    public static void m2() {

    }

    public static void m3() {

    }
}
