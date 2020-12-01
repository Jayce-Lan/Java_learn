package testSocket.testUDP1;

/*
    读写并转换包当中的数组
 */

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestUDPServer {
    public static void main(String[] args) {
        try {
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            DatagramSocket ds = new DatagramSocket(5678);
            while (true) {
                ds.receive(dp); //接收客户端传来的包

                //getLength() 获取传入打包数据的实际长度（实际传输中并不一定会达到1024的长度）
//                System.out.println(new String(buf, 0, dp.getLength()));
                //转换传入包的类型（把字节再次转为long）
                ByteArrayInputStream bais = new ByteArrayInputStream(buf);
                DataInputStream dis = new DataInputStream(bais);
                System.out.println(dis.readLong());

            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
