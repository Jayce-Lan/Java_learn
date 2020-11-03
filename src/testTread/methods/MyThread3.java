package testTread.methods;

public class MyThread3 extends Thread {
    MyThread3(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(getName() + ": " + i);
            if ((i % 10) == 0) {
                yield();
            }
        }
    }
}
