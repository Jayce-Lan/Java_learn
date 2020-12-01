package testSocket.talkRoom2;

//监听控制台客户端线程

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketThread1 implements Runnable {
    public Socket s;

    public SocketThread1(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            while (true) {
                String str = br.readLine();
                pw.println(str);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
