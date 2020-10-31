package inheritForClass;

public class Student extends Parent {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String info() {
        return "Name:" + getName() + "\nage:" + getAge()
                + "\nschool:" + this.school;
    }
}
