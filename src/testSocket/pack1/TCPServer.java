package testSocket.pack1;

        import java.io.IOException;
        import java.net.ServerSocket;
        import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建端口，端口被监听
        ServerSocket ss = new ServerSocket(6666);
        //监听并接收客户端连接，此处的accept一次只能接收一个客户端连接请求，因此如果是多个客户端连接，就要不断创建accept
        while (true) {  //使用while循环让服务器保持一直在线状态
            Socket s = ss.accept();
            System.out.println("连接成功！");
        }
    }
}