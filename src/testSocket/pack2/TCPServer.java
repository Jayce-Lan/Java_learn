package testSocket.pack2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                Socket s = ss.accept();
                //接收客户端输出的字符串   s.getInputStream():获取客户端的数据
                DataInputStream dis = new DataInputStream(s.getInputStream());
                System.out.println(dis.readUTF());
                dis.close();
                System.out.println("连接成功");
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
