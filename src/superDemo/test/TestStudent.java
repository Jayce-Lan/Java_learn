package superDemo.test;

public class TestStudent {
    public static void main(String[] args) {
        Student sd1 = new Student("Jack", "GXU");
        Student sd2 = new Student("Tom", "NanNing", "GXUN");
        System.out.println(sd1.info());
        System.out.println(sd2.info());

        //Teacher的测试
        Teacher t1 = new Teacher("Jiang", "II");
        System.out.println(t1.info());

        //方法重写的测试
        Person p1 = new Person("Jim");
        System.out.println(p1.toString());
        System.out.println(sd1.toString());
    }
}