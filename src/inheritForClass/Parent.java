package inheritForClass;

/**
 * @方法的重写
 * 1.子类可以重写父类的方法
 * 2.方法名、参数列表以及返回值类型必须一致
 * 3.重写的方法不能使用比被重写方法更严格的访问权限
 */

public class Parent {
    private String name;
    private int age;

    public String info() {
        return "Name:" + this.name + "\nage:" + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
