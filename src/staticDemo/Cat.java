package staticDemo;

/**
 * @static静态   可以在没有创建对象的情况下调用对象/方法
 */
public class Cat {
    private static int sid = 0;
    private String name;
    private int id = 0;

    public Cat(String name) {
        this.name = name;
        this.id = sid++;
    }

    public void info() {
        System.out.println(this.name + ", " + this.id);
    }

    public static void main(String[] args) {
        Cat.sid = 100;  //static可以直接调用，并且在不再次赋值后会记录自己的值，不像正常值会复原
        Cat cat1 = new Cat("mimi");
        cat1.sid = 200;
        Cat cat2 = new Cat("nana");     //在cat1获取id后会自加，静态变量会记录，因此cat1=100，cat2=101
        cat1.info();
        cat2.info();
    }
}
