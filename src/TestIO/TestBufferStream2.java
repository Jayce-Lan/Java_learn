package TestIO;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;

public class TestBufferStream2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("E:\\testA\\TestB\\testBuffed1.txt"));
            BufferedReader br =
                    new BufferedReader(new FileReader("E:\\testA\\TestB\\testBuffed1.txt"));
            String s = null;
            for (int i = 0; i <= 100; i++) {
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();   //写分行符
            }
            bw.flush();
            //readLine()以行为单位读取字符
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
