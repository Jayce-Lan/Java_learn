package TestIO;

import java.io.*;
import java.util.Date;

public class TestPrintStream3 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //new FileWriter("", true); //设置true之后，可以不摸除前面的记录的前提下继续写入数据
            FileWriter fw = new FileWriter("E:\\testA\\TestB\\TestPrint2.txt", true);
            PrintWriter log = new PrintWriter(fw);

            while ((s = br.readLine()) != null) {
                if (s.equalsIgnoreCase("exit"))
                    break;
                System.out.println(s.toUpperCase());
                log.println("---------------");
                log.println(s.toUpperCase());
                log.flush();    //刷新输出流
            }
            log.println("====" + new Date() + "====");
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
