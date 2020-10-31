package ObjectAPI;

public class TestToString {
    public static void main(String[] args) {
        Dog d = new Dog();
        /**
         * @getClass().getName() + '@' + Integer.toHexString(hashCode())
         * 会先打印类名，后半段为该类的hash编码
         */
        System.out.println(d);  //打印一个类，会默认调用toString方法
    }
}

class Dog {
    public String toString() {
        return "I'm a good dog.";       //Object类的toString方法是被建议重写的
    }
}
