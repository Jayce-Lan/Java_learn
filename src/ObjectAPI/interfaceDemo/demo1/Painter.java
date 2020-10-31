package ObjectAPI.interfaceDemo.demo1;

public interface Painter {
    public void paint();
    public void eat();
}


//通过一个类实现多个接口
class Teacher implements Singer, Painter {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void paint() {
        System.out.println(this.getName() + "老师画画");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "老师吃饭");
    }

    @Override
    public void sing() {
        System.out.println(this.getName() + "老师唱歌");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + "老师睡觉");
    }
}