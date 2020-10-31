package superDemo.test;

public class Teacher extends Person {
    private String capital;

    Teacher(String name, String capital) {
        this(name, "GuangZhou", capital);
    }

    Teacher(String name, String location, String capital) {
        super(name, location);
        this.capital = capital;
    }

    public String info() {
        return  super.info() + ", capital:" + this.capital;
    }
}
