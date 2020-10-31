package operatorDemo;

public class Demo3 {
    public static void main(String[] args) {
        int i1 = 3, i2 = 4;
        String str = "String";
        System.out.println(i1 + i2);
        System.out.println(str + (i1 + i2));
        System.out.println(str + i1 + i2);
        System.out.println("i1 + i2 = " + i1 + i2);
        System.out.println(i1 + i2 + str);
    }
}
