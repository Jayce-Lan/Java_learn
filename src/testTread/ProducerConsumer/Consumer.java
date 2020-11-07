package testTread.ProducerConsumer;

//消费者类

public class Consumer implements Runnable {
    SyncStack ss = null;
    public int num = 0; //定义消费者消费个数

    /**
     * 创建一个消费的构造方法
     * @param ss 指定需要去哪个容器中消费
     */
    public Consumer(SyncStack ss) {
        this.ss = ss;
    }

    /**
     * 重写了run方法来进行消费
     */
    @Override
    public void run() {
        //假设每个消费者每次只能消费20个产品
        for (int i = 0; i < num; i++) {
            WoTou wt = ss.pop();    //这里的返回值为一个产品类
            System.out.println("消费了：" + wt.toString());
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
