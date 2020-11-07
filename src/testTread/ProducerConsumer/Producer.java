package testTread.ProducerConsumer;

//生产者类

public class Producer implements Runnable {
    SyncStack ss = null;    //生产者中引用一个容器类
    public int num = 0;     //定义生产者生产个数

    /**
     * 该方法判定生产者在生产产品后会放到哪个容器中
     * @param ss 容器类
     */
    public Producer(SyncStack ss) {
        this.ss = ss;
    }

    /**
     * 生产者生产产品在run方法中实现
     */
    @Override
    public void run() {
        //假设每个生产者能生产20个产品
        for (int i = 0; i < num; i++) {
            WoTou wt = new WoTou(i);
            ss.push(wt);
            //此处的睡眠没有任何意义，只是为了方便测试程序时观察
            System.out.println("生产了：" + wt.toString());
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
