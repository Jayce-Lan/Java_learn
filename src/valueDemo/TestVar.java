package valueDemo;

public class TestVar {
    static int j;
    public void m() {
        int i = 0;
        System.out.println("m方法中的i=" + i);
    }

    public static void main(String[] args) {
        int i = 1;
        System.out.println("main方法中的i=" + i);
        System.out.println("成员变量j=" + j);

        boolean b = false;
        if (b) {
            System.out.println("b = true");
        }

        long longNum = 888888888;
    }
}
