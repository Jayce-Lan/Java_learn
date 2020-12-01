package testDanLiMoShi;

//饿汉式单例模式
/*
    饿汉式是典型的空间换时间
    当类装载的时候就会创建类实例，无论是否使用，然后每次调用的时候，就不需要判断了，节省了运行时间
    但是饿汉式十分占用内存
 */
public class Hungry {
    /**
     * 私有化实例
     */
    private Hungry() {

    }

    private final static Hungry HUNGRY = new Hungry();

    /**
     * 获取实例对象
     * @return 返回私有化实例
     */
    public static Hungry getInstance() {
        return HUNGRY;
    }
}
