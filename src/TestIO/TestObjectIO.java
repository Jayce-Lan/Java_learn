package TestIO;

//Object流(序列化)   直接将Object写入或读出

import java.io.*;

public class TestObjectIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        T t = new T();
        t.k = 8;
        FileOutputStream fos = new FileOutputStream("E:\\testA\\TestB\\TestObject.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(t);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("E:\\testA\\TestB\\TestObject.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        T tReaded = (T) ois.readObject();
        System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);
    }
}

//序列号接口 只是一个标记接口 用于声明序列化对象
class T implements Serializable {
    int i = 0, j = 9;
    double d = 2.3;
//    int k = 0;    //会被IO流所控制
    transient int k = 15;   //透明化接口，读取的时候不予考虑，不受IO流控制
}
