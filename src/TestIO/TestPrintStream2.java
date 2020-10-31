package TestIO;

import java.io.*;

public class TestPrintStream2 {
    public static void main(String[] args) {
        String filename = "E:\\testA\\TestB\\TestPrint1.txt";
        if (filename != null) {
            list(filename, System.out);
        }
    }

    public static void list(String f, PrintStream fs) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = null;
            while ((s = br.readLine()) != null) {
                fs.println(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("无法读取文件");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
