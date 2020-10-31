package TestIO;

import java.io.*;

public class TestBufferStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\testA\\TestB\\testIO1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);     //缓冲流
            int c = 0;

            System.out.println(bis.read());
            System.out.println(bis.read());

            bis.mark(100);
            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
                System.out.print((char) c + " ");
            }
            System.out.println();
            bis.reset();    //重置，从100开始读(mark(100))
            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
                System.out.print((char) c + " ");
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
