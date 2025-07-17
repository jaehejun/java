package java0717;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        BufferedReader in = null; // 소켓입력
        BufferedReader stin = null; // 키보드 입력

        PrintWriter out = null;
        ServerSocket server = null;
        Socket socketOfServer = null;

        try {
            server = new ServerSocket(9999); // 서버 소켓 생성
            socketOfServer = server.accept(); // 클라이언트로부터 연결 요청 대기

            System.out.println("연결됨");
            in = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream())); // from client
            stin = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
            out = new PrintWriter(new OutputStreamWriter(socketOfServer.getOutputStream())); // to client

            String inputMessage;
            while (true) {
                inputMessage = in.readLine(); // 클라이언트에서 한 행의 문자열 읽음
                if (inputMessage.equalsIgnoreCase("bye"))
                    break;
                System.out.println(inputMessage);
                String outputMessage = stin.readLine(); // 키보드에서 한 행의 문자열 읽음
                out.println("서버> " + outputMessage);
                out.flush();
            }
        } catch (IOException e) {
        } finally {
            try {
                socketOfServer.close();
                server.close();
            } catch (IOException e) {
            }
        }
    }
}
