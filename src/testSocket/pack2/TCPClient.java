package testSocket.pack2;

        import java.io.DataOutputStream;
        import java.io.IOException;
        import java.io.OutputStream;
        import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 8888);
            OutputStream os = s.getOutputStream();  //返回连接的输出流
            //以字符串的形式输出字符串
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("Hello Server");
            dos.flush();
            dos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
