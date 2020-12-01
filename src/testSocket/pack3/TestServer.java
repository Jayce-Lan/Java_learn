package testSocket.pack3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    由服务器向客户端写入的语句
    服务器接收到客户端的端口号等信息，随后返回给客户端
    客户端会显示服务器端返回的信息
 */

public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                Socket s1 = ss.accept();
                OutputStream os = s1.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                //@getInetAddress() 获取IP地址，在这里是拿到客户端的IP地址
                dos.writeUTF("Hello," + s1.getInetAddress() + "port#" + s1.getPort() + "bye-bye!");
                dos.close();
                s1.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("程序运行出错：" + e);
        }
    }
}
