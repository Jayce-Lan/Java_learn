package TestIO;

//转换流

import java.io.*;

public class TestTransForm1 {
    public static void main(String[] args) {
        try {
            //可以实现以字符为单位往文件写入内容
            OutputStreamWriter osw =
                    new OutputStreamWriter(new FileOutputStream("E:\\testA\\TestB\\char.txt"));
            osw.write("This is a test word");
            //获取写入的字符类型，默认为UTF-8
            System.out.println(osw.getEncoding());
            osw.close();

            //FileOutputStream(name, append):append确认是否在文件已有的字符后面继续插入字符
            osw = new OutputStreamWriter(new FileOutputStream("E:\\testA\\TestB\\char.txt", true), "ISO8859_1");
            osw.write("This is a test word");
            //获取写入的字符类型，由于被指定，因此使用的是ISO8859_1编码（ISO8859包含了所有西欧语言）
            System.out.println(osw.getEncoding());
            osw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到文件");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
