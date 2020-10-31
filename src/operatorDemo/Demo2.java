package operatorDemo;

public class Demo2 {
    public static void main(String[] args) {
        boolean a, b, c;
        a = true;
        b = false;
        System.out.println("a | b = " + (a | b));
        System.out.println("a & b = " + (a & b));
        System.out.println("a ^ b = " + (a ^ b));    //只要两者不一致，则为true
        System.out.println("a || b = " + (a || b));
        System.out.println("a && b = " + (a && b));
        System.out.println("! a = " + ! a);
        System.out.println("! b = " + ! b);
    }
}
