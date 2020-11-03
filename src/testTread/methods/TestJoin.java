package testTread.methods;

//jion方法合并线程

public class TestJoin {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2("mt1");
        mt.start();

        try {
            mt.join();  //相当于方法调用
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("I am main");
        }
    }
}
