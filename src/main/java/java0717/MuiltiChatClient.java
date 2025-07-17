package java0717;

// 클라이언트 실행 시 사용자 아이디와 서버 IP 주소 전달
// 다른 클라이언트 접속시 ***님이 접속했습니다 메시지 출력
// 다른 사람의 대화 내용이 키보드 입력중에도 화면에 출력
// 키보드 입력 + 엔터 -> 다른 클라이언트에 문자열 전송
// 클라이언트 종료시 ***님이 접속 종료했습니다 메시지 출력

// 클라이언트 -> 서버 전송 정보
// 클라이언트 ID
// 사용자로부터 입력 받은 문자열
// 접속이 종료됨

import java.io.*;
import java.net.Socket;

//class MultiChatClientThread extends Thread {
//    private Socket socket;
//    private
//}

public class MuiltiChatClient {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("사용법: java MultiChatClient [아이디] [서버IP]");
            return;
        }

        String clientId = args[0];
        String serverIp = args[1];

        try (
                Socket clientSocket = new Socket(serverIp, 9999); // 클라이언트 소켓 생성
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // from server
                BufferedReader stin = new BufferedReader(new InputStreamReader(System.in)); // from keyboard
                PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true); // to server
                ) {
            out.println(clientId); // 첫 줄에 아이디 전송
            // 수신 스레드
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {}
            }).start();

            // 전송 루프
            String line;
            while ((line = stin.readLine()) != null) {
                out.println(line);
                if (line.equalsIgnoreCase("/quit"))
                    break;
            }
        } catch (IOException e) {}
    }
}
