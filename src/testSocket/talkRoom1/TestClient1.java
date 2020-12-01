package testSocket.talkRoom1;

//客户端

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TestClient1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 8888);
        System.out.println("Client1连接成功...");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        while (true) {
            pw.println("Client1说：" + br.readLine());
            pw.flush();
        }
    }
}