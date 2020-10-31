package ObjectAPI.testInsranceof;

/**
 * @instanceof 是 Java 的一个二元操作符，类似于 ==，>，< 等操作符。
 * @instanceof 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
 */

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal("coco");
        Cat c = new Cat("toto", "blue");

        System.out.println(a instanceof Animal);    //true
        System.out.println(c instanceof Animal);    //true
        System.out.println(a instanceof Dog);       //false

        /**
         * 由于a是由Animal类创建的 因此在栈内存中只被访问了name这个变量
         * 父类对象被作为引用的时候，只被看见父类的对象和方法，子类的会被忽略
         */
        a = new Dog("aoao", "yellow");
        System.out.println(a.name);         //aoao
//        System.out.println(a.furColor);     //!error
        System.out.println(a instanceof Dog);       //true

        //强制转换之后，子类的对象和方法将不会被忽略
        Dog d1 = (Dog) a;
        System.out.println(d1.furColor);        //yellow
        System.out.println(d1 instanceof Dog);  //true

        System.out.println("------------------------------");

        Test test = new Test();
        test.f(a);
    }

    public void f(Animal a) {
        System.out.println("name:" + a.name);
        if (a instanceof Cat) {
            Cat cat = (Cat) a;
            System.out.print(" eyesColor:" + cat.eyesColor);
        } else if (a instanceof Dog) {
            Dog dog = (Dog) a;
            System.out.print(" furColor:" + dog.furColor);
        }
    }
}
