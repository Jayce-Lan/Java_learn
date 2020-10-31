package ObjectAPI.interfaceDemo.demo1;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小明");
        s1.sing();
        s1.sleep();
        s1.study();

        System.out.println("---------------------");
        Teacher t1 = new Teacher("Jony");
        t1.paint();

        Singer s2 = new Student("Cuu");
        //s2只看得到Singer的方法
        s2.sing();

        Test test = new Test();
        test.f(t1);
    }

    public void f(Singer s) {
        s.sing();
    }
}
