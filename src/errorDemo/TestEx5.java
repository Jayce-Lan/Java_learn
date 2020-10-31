package errorDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEx5 {
    //由于f1和f3都抛出了异常，因此在main方法中只能抛出或处理异常
    public static void main(String[] args) {
        TestEx5 te = new TestEx5();
        try {
            te.f3();
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    //IOException是FileNotFoundException的父类，因此此处的FileNotFoundException也可以省略
    public void f() throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream("test.txt");
        int num;
        num = in.read();
        while (num != -1) {
            System.out.print((char) num);
            num = in.read();
        }
    }

    //当另一个方法需要调用f()方法时，要么使用try...catch处理异常，要么就需要throws抛出异常
    public void f2() {
        try {
            f();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void f3() throws IOException {
        f();
    }
}
