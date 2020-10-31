package TestIO;

import java.io.*;

/**
 * FileInputStream与FileOutputStream中，使用read()方法是逐个字节读取数据
 * 因为一个中文占用两个字节。因此此方法不适合用于中文文档
 */

public class TestFileOutStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("E:\\testA\\TestB\\testIO1.txt");
            out = new FileOutputStream("E:\\testA\\TestB\\testIO2.txt");

            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e2) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e1) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }

        System.out.println("文件已复制");
    }
}
