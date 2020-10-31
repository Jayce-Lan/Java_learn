package TestIO;

//数据流

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        //字节数组
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //可以一次性写入多个字节的内容
        DataOutputStream dos = new DataOutputStream(baos);

        try {
            dos.writeDouble(Math.random());     //占8个字节
            dos.writeBoolean(true);         //布尔类型占1个字节

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());

            System.out.println(bais.available());   //9 内容的所有字节数
            DataInputStream dis = new DataInputStream(bais);

            //要遵循先写先读的顺序（队列）
            System.out.println(dis.readDouble());   //Math.random()
            System.out.println(dis.readBoolean());  //true(dos.writeBoolean(true);)

//            System.out.println(dis.readDouble());

            dos.close();    dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
