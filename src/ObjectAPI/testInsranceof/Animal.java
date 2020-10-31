package ObjectAPI.testInsranceof;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public String eyesColor;

    public Cat(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }
}

class Dog extends Animal {
    public String furColor;
    public Dog(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }
}
