package ObjectAPI.abstractDemo;

/**
 * 抽象类
 */

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("coco", "red");
        cat.enjoy();
    }
}

/**
 * @定义抽象类Animal
 */
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * @enjoy 抽象方法
     */
    public abstract void enjoy();
}

class Cat extends Animal {
    private String eyesColor;

    public Cat(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    @Override
    public void enjoy() {
        System.out.println("猫叫");
    }
}