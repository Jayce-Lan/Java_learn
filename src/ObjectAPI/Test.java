package ObjectAPI;

/**
 * 动态绑定
 */

public class Test {
    public static void main(String[] args) {
        Pig pig1 = new Pig("coco", "bule");
        Bird bird1 = new Bird("koko", "red");

        Lady girl1 = new Lady("Juuly", pig1);

        girl1.myPetEnjoy();
    }
}

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public void enjoy() {
        System.out.println("开心");
    }
}

class Bird extends Animal {
    private String furColor;

    Bird(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public void enjoy() {
        System.out.println("鸟叫");
    }
}

class Pig extends Animal {
    private String eyesColor;

    Pig(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    public void enjoy() {
        System.out.println("猪叫");
    }
}

class Lady {
    private String name;
    private Animal pet;

    Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void myPetEnjoy() {
        pet.enjoy();    //动态绑定
    }
}