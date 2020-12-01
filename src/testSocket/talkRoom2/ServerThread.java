package testSocket.talkRoom2;

//服务器端线程

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while (true) {
                String str = br.readLine();
                for (Socket item : SocketServer.socketList) {
                    PrintWriter pw = new PrintWriter(item.getOutputStream());
                    pw.println("用户 " + s.getPort() + " ：" + str);
                    pw.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
