package errorDemo;

/**
 * try...catch完成异常捕获
 */

public class TestEx2 {
    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
            //java.lang.ArithmeticException为异常原因，因此要捕获该异常
        } catch (ArithmeticException e) {
//            e.printStackTrace();      //错误的堆栈信息
            System.out.println("出错了");
        } finally {
            System.out.println("执行完毕");
        }
    }
}
