package errorDemo;

public class TestEx3 {
    public static void main(String[] args) {
        TestEx3 te = new TestEx3();
        te.method(0);
    }
    public void method(int i) throws ArithmeticException {
        if (i == 0)
            throw new ArithmeticException("被除数为0");
    }
}
