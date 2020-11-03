package testTread.Synchronize;

//关于线程上锁与未上锁的方法的问题
//m1/m2方法均上锁
//---------------由于两边都进行了线程锁，因此两个输出结果互不干涉

public class TestEx3 implements Runnable {
    public int num = 100;

    public synchronized void m1() {
        num = 1000;
        try {
            Thread.sleep(5000);
            System.out.println("m1().num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void m2() {
        try {
            Thread.sleep(2500);
            num = 2000;
            System.out.println("m2().num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        m1();
    }

    public static void main(String[] args) {
        TestEx3 te = new TestEx3();
        Thread t = new Thread(te);

        t.start();
        te.m2();    //由于两边都进行了线程锁，因此两个输出结果互不干涉
    }
}
