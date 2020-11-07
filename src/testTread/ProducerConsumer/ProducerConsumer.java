package testTread.ProducerConsumer;

//测试类

public class ProducerConsumer {
    public static void main(String[] args) {
        //容器类
        SyncStack ss = new SyncStack();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);

        /*
        生产者与消费者需要有一个产品平衡，因此它们的关系是：
        消费者个数 * 消费者生产个数 == 生产者个数 * 生产者人数
         */
        p.num = 20;
        c.num = 20;

        new Thread(p).start();
        new Thread(c).start();
    }
}
