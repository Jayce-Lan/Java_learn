package superDemo.test;

public class Student extends Person {
    private String school;

    Student (String name, String school) {
        this(name, "ShenZhen", school);
    }

    Student (String name, String location, String school) {
        super(name, location);
        this.school = school;
    }

    public String toString() {
        return "I'm Student" + this.school + super.info();
    }

    public String info() {
        return super.info() + ", school:" + this.school;
    }
}
