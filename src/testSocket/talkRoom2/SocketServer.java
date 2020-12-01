package testSocket.talkRoom2;

//完成客户端与客户端通信
//服务端

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer {
    public static List<Socket> socketList = new ArrayList<Socket>();
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("服务器启动...");
        while (true) {
            Socket s = ss.accept();
            System.out.println("上线通知：用户" + s.getPort() + "上线了！" );
            socketList.add(s);
            new Thread(new ServerThread(s)).start();
        }
    }
}
