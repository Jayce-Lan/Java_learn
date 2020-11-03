package testTread;

//这里继承Thread类可以直接启用start方法，而不需要再调用Thread类来实现start()方法
public class Runner2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner2----------" + i);
        }
    }
}
