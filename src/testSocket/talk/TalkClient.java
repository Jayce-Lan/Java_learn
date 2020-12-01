package testSocket.talk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TalkClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 6666);
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readline;
            readline = sin.readLine();
            while (!readline.equals("exit")) {
                pw.println(readline);
                pw.flush();
                System.out.println("Client:" + readline);
                System.out.println("Server:" + bf.readLine());
                readline = sin.readLine();
            }
            pw.close();
            bf.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("连接错误");
        }
    }
}
