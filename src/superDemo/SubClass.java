package superDemo;

public class SubClass extends SuperClass {
    private int n;

    SubClass(int n) {
        //当子类没有调用父类的构造方法的时候，系统默认寻找父类的无参构造方法
        System.out.println("SubClass(" + n + ")");
    }

    SubClass() {
        super(300);     //子类构造方法必须调用父类构造方法
        System.out.println("SubClass()");
    }
}
