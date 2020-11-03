package testTread;

/**多线程的实现方法1：使用Runnable接口/Threa接口
 * 继承Thread类可以直接启用start方法，而不需要再调用Thread类来实现start()方法
 * 但是使用继承会受限于只能继承一个类，因此一般都使用Runnable接口
 */


public class TestTread2 {
    public static void main(String[] args) {
//        Runner1 r1 = new Runner1();
//        r1.run();       //方法调用 由于run方法被调用，因此会先执行run，再执行main下面的代码

//        Thread t = new Thread(r1);
//        t.start();  //线程启动 产生分支 Runnr1的run方法与main方法交替执行

        Runner2 r2 = new Runner2();
        r2.start();

        for (int i = 0; i < 100; i++){
            System.out.println("Main run----------------" + i);

        }
    }
}