//Java的输入输出I/O流

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemDemo {
    public static void main(String[] args) {
        String str;

        //接受输入对象
        InputStreamReader stdio = new InputStreamReader(System.in);
        //缓冲流
        BufferedReader bufin = new BufferedReader(stdio);
        try {
            System.out.print("请输入字符：");
            str = bufin.readLine();
            System.out.println("您输入的字符为：" + str);
        } catch (Exception e) {
            System.out.println("发生I/O错误！");
            System.err.println("发生I/O错误！");
            e.printStackTrace();
        }
    }
}
