package inheritForClass;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jack");
        student.setAge(20);
        student.setSchool("GXUN");

        Parent par = new Parent();

        par.setAge(30);
        par.setName("Tom");

//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getSchool());
        System.out.println(student.info());
        System.out.println(par.info());
    }
}
