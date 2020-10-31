package methodDemo;

public class TestMethod1 {
    public static void main(String[] args) {
        mDemo();
        division("mDemo2");
        mDemo2(3);
        division("mDemo3");
        mDemo3(3, 4);
        division("mDemo4");
        int mDemo4 = mDemo4(9, 10);
        System.out.println(mDemo4);
    }

    public static void mDemo() {
//        return;   //如果把return放在这里，会直接编译报错，因为return之后便不会再执行下面的任何步骤
        System.out.println("I'am mDemo!");
        System.out.println("Hello Method!");
//        return;
    }

    //分割线

    /**
     * 分割线
     * @param str
     */
    public static void division(String str) {
        System.out.println("-------------------" + str + "-----------------------");
    }

    /**
     * 由于为void 因此返回值必须为空
     * @param i
     */
    public static void mDemo2(int i) {
        System.out.println("I'am mDemo2");
        if (i > 3) {
            return;
        }
        System.out.println("i <= 3");
    }

    public static void mDemo3(int i, int j) {
        System.out.println(i + "+" + j + "=" + (i + j));
    }

    /**
     * 这里的返回值必须是事先约定好的int类型
     * @param i
     * @param j
     * @return  两数中较大的数
     */
    public static int mDemo4(int i, int j) {
        return i > j ? i : j;   //方法调用后返回值进入了一个缓存区
    }
}
