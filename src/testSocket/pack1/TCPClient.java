package testSocket.pack1;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //设置一个连接申请，并设定客户端本地IP，最后设定需要连接的服务器
        Socket s = new Socket("127.0.0.1", 6666);
    }
}
