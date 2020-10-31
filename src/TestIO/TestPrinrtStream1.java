package TestIO;

//打印流

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrinrtStream1 {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("E:\\testA\\TestB\\TestPrint1.txt");
            ps = new PrintStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (ps != null) {
            //将原本要输出到控制台的内容输出到ps指向的文件当中
            System.setOut(ps);
        }

        int ln = 0;
        for (char c = 0; c <= 60000; c++) {
            System.out.print(c + " ");
            if (ln++ >= 100) {
                System.out.println();
                ln = 0;
            }
        }
    }
}
