package ObjectAPI;

public class TestObjece {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        System.out.println(str1.hashCode()); //返回对象的hash编码
        System.out.println(str1.toString());

        int num1 = 90;
        int num2 = 100;
        System.out.println(num1 + num2);
    }
}
