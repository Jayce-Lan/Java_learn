package testTread.methods;

//一共三条线程在执行

public class TestYeild {
    public static void main(String[] args) {
        MyThread3 mt1 = new MyThread3("mt1");
        MyThread3 mt2 = new MyThread3("mt2");

        mt1.start();
        mt2.start();
    }
}
