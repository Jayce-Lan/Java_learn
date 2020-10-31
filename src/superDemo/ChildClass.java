package superDemo;

/**
 * @super关键字：重复调用父类方法，指向当前对象的父类对象
 */

public class ChildClass extends FatherClass {
    public int value;

    public void f() {
        super.f();
        this.value = 200;
        System.out.println("ChildValue = " + this.value);
        System.out.println(super.value);
    }
}
