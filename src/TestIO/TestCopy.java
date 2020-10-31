package TestIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader和FileWriter中的read()/write方法可以快速的读写文件中的字符
 */

public class TestCopy {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        int c = 0;

        try {
            String frName = "E:\\testA\\TestB\\testFileReader1.txt";
            String fwName = "E:\\testA\\TestB\\testFileWriter2.txt";
            fr = new FileReader(frName);
            fw = new FileWriter(fwName);

            int count = 0;

            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            fr.close();
            fw.close();

            System.out.println("复制成功！");

        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件写入错误");
        }
    }
}
