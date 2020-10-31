package ObjectAPI.interfaceDemo.demo3;

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.f());
    }
}

interface One {
    public boolean f();
    public void m();
}

interface Two {
    public boolean f();
}

class Demo implements One, Two {

    /**
     * demo实现了两个接口，f()方法在两个接口中方法名/返回值一致，因此得到了一样的返回
     * @return
     */
    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void m() {

    }
}