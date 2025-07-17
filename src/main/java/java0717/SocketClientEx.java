package java0717;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClientEx {
    public static void main(String[] args) {
        try {
            Socket socketOfClient  = new Socket("127.0.0.1", 9999);
            OutputStream out = socketOfClient.getOutputStream(); // 소켓에 출력스트림 연결
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out), true);
            pw.println("Hi, Server"); //서버에 연결된 소켓으로 출력
        } catch (Exception e) {}
    }
}
