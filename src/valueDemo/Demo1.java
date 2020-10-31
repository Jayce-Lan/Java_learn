package valueDemo;

public class Demo1 {
    static int j = 20;
    public static void main(String[] args) {
        int a, b, c = 10;
        a = 10;
        b = 11;

        byte byteNum = 127; //-128-127
        System.out.println(a + "," + b + "," + c);
        System.out.println(j);
        System.out.println("----------------------------------");
        boolean bl = true;
        System.out.println(bl);
        System.out.println(byteNum + 1);    //128
        System.out.println(++byteNum);      //-128
    }
}
