package testTread.Synchronize;

//关于线程上锁与未上锁的方法的问题
//假设m1方法上锁，m2方法未上锁，同时执行并打印num时，m2中的num的值也做了改变
//---------未上锁的方法不会受到上锁方法的干扰去延迟或中断它的执行，并且由于变量改变的原因，未上锁的方法如果改变了变量，那么上锁方法的变量也会遭到改变

public class TestEx2 implements Runnable {
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

    public void m2() {
        num = 2000;
        System.out.println("m2().num = " + num);
    }

    @Override
    public void run() {
        m1();
    }

    public static void main(String[] args) throws InterruptedException {
        TestEx2 te = new TestEx2();
        Thread t = new Thread(te);

        t.start();
        Thread.sleep(1000);
        te.m2();    //由于m2重新定义了num，因此打印结果双方均为2000
    }
}
