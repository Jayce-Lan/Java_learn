package TestIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;

        try {
            in = new FileInputStream("E:\\testA\\TestB\\testIO1.txt");
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("找不到指定文件");
            System.exit(-1);
        }

        try {
            long num = 0;
            //in.read()==-1则说明读取完毕文档中的内容
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
                num ++;
            }

            in.close();
            System.out.println();
            System.out.println("共读取了" + num + "个字节");
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
