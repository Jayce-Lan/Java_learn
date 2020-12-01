package testDanLiMoShi;

//懒汉式
/*
    单例模式的懒汉式体现了缓存的思想，延时加载就是一开始不要加载资源或者数据，一直 等，等到马上就要使用这个资源的或者数据了，躲不过去了才去加载。
    懒汉式是定性的时间换空间，不加同步的懒汉式是线程不安全的
 */
public class LazyMan {
    /**
     * 构造器私有化
     */
    private LazyMan() {

    }

    private volatile static LazyMan lazyMan;

    /**
     * 确保线程安全的双重检测锁模式
     * @return
     */
    public static LazyMan getInstance() {
        //加上线程锁
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();
                    /*
                        实际上，这个给new经历了三次操作：
                        1.分配内存空间
                        2.执行构造方法，初始化对象
                        3.把这个对象指向这个空间
                     */
                }
            }
        }
        return lazyMan;
    }
}
