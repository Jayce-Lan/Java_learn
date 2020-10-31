package ObjectAPI.interfaceDemo.demo1;

public interface Singer {
    public void sing();
    public void sleep();
}

class Student implements Singer {

    private String name;

    public Student(String name) {
        this.name  = name;
    }

    public void study() {
        System.out.println(this.getName() + "正在学习");
    }

    public String getName() {
        return name;
    }


    @Override
    public void sing() {
        System.out.println(this.getName() + "学生唱歌");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + "学生睡觉");
    }
}
