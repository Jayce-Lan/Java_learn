package hello;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamInTest {
    public static void main(String[] args) {
        String str;
        InputStreamReader stdin = new InputStreamReader(System.in);
        BufferedReader bufin = new BufferedReader(stdin);
        try {
            System.out.print("请输入字符：");
            str = bufin.readLine();
            System.out.println("输入字符为：" + str);
        } catch (Exception e) {
            System.out.println("发生I/O错误");
            e.printStackTrace();
        }
    }
}
