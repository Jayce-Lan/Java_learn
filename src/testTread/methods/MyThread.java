package testTread.methods;

import java.util.Date;

public class MyThread extends Thread {
    boolean flag = true;

    @Override
    public void run() {
        while (flag) {
//        while (true) {
            System.out.println("---------" + new Date() + "---------");
            try {
                sleep(1000);
                //由于是重写的方法，因此只能抛出父类的异常
            } catch (InterruptedException e) {
//                return;
            }
        }
    }

    public void shutdown() {
        flag = false;
    }
}
