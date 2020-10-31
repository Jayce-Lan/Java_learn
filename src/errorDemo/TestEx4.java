package errorDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEx4 {
    public static void main(String[] args) {
        FileInputStream in = null;

//        in = new FileInputStream("my.txt"); //必须捕捉以便抓取异常
        try {
            in = new FileInputStream("my.txt");
            int b = in.read();

            while (b != -1) {
                System.out.println((char) b);
                b = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("错误信息" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
