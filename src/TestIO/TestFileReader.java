package TestIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        int c = 0;

        try {
            fr = new FileReader("E:\\testA\\TestB\\testFileReader1.txt");
            while ((c = fr.read()) != -1) {
                System.out.print(c + " ");
            }

            System.out.println();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到指定文件");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读取错误");
        }
        System.out.println("文件读取完毕");
    }
}
