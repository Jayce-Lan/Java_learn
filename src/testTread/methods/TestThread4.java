package testTread.methods;

public class TestThread4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner4());
        t1.start();

        for (int i = 0; i <= 50; i++) {
            System.out.println("TestThread: " + i);
        }
    }
}

class Runner4 implements Runnable {
    @Override
    public void run() {
        //Thread.currentThread():当前的Thread
        System.out.println(Thread.currentThread().isAlive());
        for (int i = 0; i <= 50; i++) {
            System.out.println("Runner------------" + i);
        }
    }
}
