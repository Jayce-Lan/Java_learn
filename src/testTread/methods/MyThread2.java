package testTread.methods;

public class MyThread2 extends Thread {
    MyThread2(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am " + getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
