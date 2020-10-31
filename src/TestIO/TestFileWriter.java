package TestIO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("E:\\testA\\TestB\\testFileWriter1.txt");
            for (int c = 0; c < 50000; c++) {
                fw.write(c);
            }
            fw.close();
            System.out.println("文件写入完毕");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写入错误！");
            System.exit(-1);
        }
    }
}
