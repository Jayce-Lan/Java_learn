package testSocket.testUDP1;


import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TestUDPClient {
    public static void main(String[] args) {
        try {
            //getBytes() 把一个字符串解析为字节数组
//            byte[] buf = (new String("Hello")).getBytes();
            long num = 10_000L;
            //将long类型数转为byte数组
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeLong(num);
            byte[] buf = baos.toByteArray();

            //把字节数组放入包内并发送出去
            DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678));
            DatagramSocket ds = new DatagramSocket(9999);
            ds.send(dp);
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
