package testFile;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        //系统依赖的默认名称分隔符字符，表示为方便的字符串。此字符串包含一个字符，可以被“/”代替
        String separator = File.separator;

        String fileName = "myfile.txt";
        String fileDirectory = "packageA/packageC";

        File f = new File(fileDirectory, fileName);

        if (f.exists()) {
            System.out.println("文件名：" + f.getAbsolutePath());
            System.out.println("文件大小：" + f.length());
        } else {
            //获取该class所在包的父级，并在此创建文件
            f.getParentFile().mkdirs();
            try {
                //如果文件不存在 会新建一个文件
                f.createNewFile();
                System.out.println(fileName + "创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
