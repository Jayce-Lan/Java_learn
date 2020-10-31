package superDemo.test;

public class Person {
    private String name;
    private String location;

    Person (String name) {
        this.name = name;
        this.location = "GuangZhou";
    }

    Person (String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String toString() {
        return "I'm Person" + this.info();
    }

    public String info() {
        return "name:" + this.name + ", location:" + this.location;
    }
}
