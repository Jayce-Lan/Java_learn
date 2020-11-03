package testTread;

public class TestPrority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());

        //并不会强制把所有CPU空间都分给t1，而是会大部分时间优先执行t1
        t1.setPriority(Thread.NORM_PRIORITY + 3);
        t1.start();
        t2.start();
    }
}

class T1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("T1----------" + i);
        }
    }
}

class T2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("T2: " + i);
        }
    }
}