package testSocket.talkRoom1;

//服务器端
//实现多个客户端与一个服务端连接

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("服务器启动成功...");
        while (true) {
            Socket s = ss.accept();
            /*
            @s.getInetAddress() 返回套接字连接的地址。
            @s.getPort() 返回此套接字连接的远程端口号。
             */
            System.out.println("上线通知：" + s.getInetAddress() + "：" + s.getPort());
            new Thread(new ServerThread(s)).start();
        }
    }
}
