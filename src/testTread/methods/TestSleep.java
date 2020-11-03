package testTread.methods;

public class TestSleep {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

//        mt.interrupt();//关闭当前线程，由于方法太过粗暴，这并不是很好的关闭线程的方式
        mt.shutdown();
    }
}