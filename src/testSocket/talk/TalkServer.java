package testSocket.talk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6666);
            Socket socket = server.accept();
            String line = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Client" + br.readLine());
            line = sin.readLine();
            while (!line.equals("exit")) {
                pw.println(line);
                pw.flush();
                System.out.println("Server:" + line);
                System.out.println("Client:" + br.readLine());
                line = sin.readLine();
            }

            br.close();
            pw.close();
            server.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
    }
}
