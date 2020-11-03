package testTread.Synchronize;

//关于线程上锁与未上锁的方法的问题
//假设m1方法上锁，m2方法未上锁，同时执行并打印num时，m2中的num的值打印时间会不会受m1的影响；它的值会不会受m1的影响
//---------未上锁的方法不会受到上锁方法的干扰去延迟或中断它的执行，但是它的变量会由方法执行前后的影响而被去改变

public class TestEx1 implements Runnable {
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
        System.out.println("m2().num = " + num);
    }

    @Override
    public void run() {
        m1();
    }

    public static void main(String[] args) throws InterruptedException {
        TestEx1 te = new TestEx1();
        Thread t = new Thread(te);

        t.start();
        Thread.sleep(1000);
        te.m2();    //由于m2没有上锁，因此依旧会越过m1执行，但是由于m1定义了num，因此m2中打印出来的num为1000
    }
}
