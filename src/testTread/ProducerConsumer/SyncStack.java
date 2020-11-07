package testTread.ProducerConsumer;

//容器类：生产物品后盛放物品的容器（wait()方法的使用）

public class SyncStack {
    int index = 0;      //计数器，计算装入多少个产品
    WoTou[] arrWT = new WoTou[6];   //创建一个产品数组，长度为6

    /**
     * 声明一个方法，放入产品
     * <1>值得注意的是，如果未加上线程锁，那么如果两个产品同时被放入很容易发生产品计数被覆盖而产生的计数不准确问题
     * <2>加入线程锁synchronized，保证该方法在使用途中不会被第二个添加打断计数器计数
     * <3>由于容器最大容量仅为6，而数生产者最高生产量为20，此时会发生报错
     * <4>解决这一方法的途径是等待容器内的产品被消费后再放入，此时可以使用wait()方法
     *
     * @param wt 被放入的产量
     * @wait() 等待线程空闲，wait()期间，并不会像sleep那样自动再次执行程序，而是需要被唤醒，并且wait期间，该线程不再属于原对象
     * @notify() 与wait()方法相对应，用于唤醒等待的线程
     */
    public synchronized void push(WoTou wt)  {
        //此处使用while循环而不使用if判断，是为了能保证index在执行时不会出现问题
        while (index == arrWT.length) {
            /*
            值得注意的是，这里的wait()方法使用的是Object类的，而不是Thread中的
            因此在此处锁定的是调用了当前对象的线程
             */
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //此处使用this.notify()是为了保证即使多个生产者消费者，依旧可以进行唤醒睡眠
//        this.notify();
        this.notifyAll();
        arrWT[index] = wt;
        index++;
    }

    /**
     * 声明一个返回值为产品类的方法，取出产品
     * 取出过程中同样容易发生计数被覆盖问题，同样的，加入线程锁
     *
     * @return 返回被取出产品后的产品数组
     */
    public synchronized WoTou pop()  {
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        this.notify();
        this.notifyAll();
        index--;
        return arrWT[index];
    }
}
