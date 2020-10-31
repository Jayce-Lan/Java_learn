package errorDemo;

public class TestEx1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        System.out.println(arr[4]);     //数组下标越界
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

        System.out.println(2 / 0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
