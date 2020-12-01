package testSocket.talkRoom2;

import java.io.IOException;
import java.net.Socket;

public class SocketClient2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.2", 6666);
        System.out.println("用户2连接成功...");
        new Thread(new SocketThread1(s)).start();
        new Thread(new SocketThread2(s)).start();
    }
}
