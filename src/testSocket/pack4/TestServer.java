package testSocket.pack4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器与客户端的双向互通
    实现双向的读写数据
    双方的读写顺序必须相反，否则将会形成阻塞
 */

//客户端先读后写

public class TestServer {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            ServerSocket ss = new ServerSocket(8888);
            Socket socket = ss.accept();
            in = socket.getInputStream();
            out = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(in);
            DataOutputStream dos = new DataOutputStream(out);
            String str = null;
            //只要客户端传入的值不为空，就进行读取
            if ((str = dis.readUTF()) != null) {
                System.out.println(str);
                System.out.println("from:" + socket.getInetAddress());  //IP地址
                System.out.println("port:" + socket.getPort()); //端口号
            }
            //读取之后再写
            dos.writeUTF("hi, hello");
            dis.close();
            dos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("连接错误：" + e);
        }
    }
}
