package ObjectAPI.TestFinal;

public class TestFinal {
    public static void main(String[] args) {
        T t = new T();
        System.out.println(t.num == 8);
        t.m(0);
    }
}

class T {
    final int num = 8;

    /**
     *
     * @param j j一旦被传入，那么将无法被改变，也无法在方法中改变j
     */
    public void m(final int j) {
        System.out.println(j);
    }

    public final void f() {
        System.out.println("该方法不能被重写");
    }
}