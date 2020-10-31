package valueDemo;

public class Demo2 {
    public static void main(String[] args) {
        double d1 = 1e200;
        float f1 = (float) d1;
        System.out.println(f1);     //Infinity数据溢出
    }
}
