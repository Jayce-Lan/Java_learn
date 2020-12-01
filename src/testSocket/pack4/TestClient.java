package testSocket.pack4;

//客户端先写后读

import java.io.*;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            //先写后读
            dos.writeUTF("hey");
            String str = null;
            if ((str = dis.readUTF()) != null) {
                System.out.println(str);
            }
            dos.close();
            dis.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务器连接失败...");
        }
    }
}
