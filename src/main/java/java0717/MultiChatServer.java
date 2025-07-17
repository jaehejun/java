package java0717;

// 새로운 클라이언트 접속 -> 이미 접속된 클라이언트들에게 ***님이 접속했습니다. 브로드캐스팅
// 클라이언트 문자열 전송 -> 이미 접속된 클라이언트들에게 문자열 브로드캐스팅
// 클라이언트 접속 종료 -> 접속된 나머지 클라이언트들에게 ***님이 접속 종료했습니다 브로드캐스팅

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 클라이언트 연결을 처리하는 스레드
class ClientHandler extends Thread {
    private Socket socket;
    private PrintWriter out;
    private String clientId;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public String getClientId() {
        return clientId;
    }

    public void send(String msg) {
        out.println(msg);
    }

    @Override
    public void run() {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            // 첫 메시지는 클라이언트 ID로 간주
            clientId = in.readLine();
            MultiChatServer.addClient(clientId, this);
            MultiChatServer.broadcast(clientId + " 님이 접속했습니다.", this);

            String msg;
            while ((msg = in.readLine()) != null) {
                if (msg.equalsIgnoreCase("/quit"))
                    break;

                // 귓속말 형식 : /to [clientId] [message]
                if (msg.startsWith("/to ")) {
                    String[] tokens = msg.split(" ", 3);
                    if (tokens.length >= 3) {
                        String targetId = tokens[1];
                        String whisper = tokens[2];
                        MultiChatServer.whisper(clientId, targetId, whisper);
                    }
                }
                else
                    MultiChatServer.broadcast(clientId + " : " + msg, this);
            }
        } catch (IOException e) {}
        finally {
            MultiChatServer.broadcast(clientId + " 님이 접속 종료했습니다.", this);
            MultiChatServer.removeClient(this);
            try { socket.close(); } catch (IOException e) {}
        }
    }
}

public class MultiChatServer {

    // 접속 클라리언트 리스트 (스레드 안전)
    private static Map<String, ClientHandler> clients = Collections.synchronizedMap(new HashMap<String, ClientHandler>());

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("서버 시작!");

        while (true) {
            Socket socket = serverSocket.accept();
            ClientHandler handler = new ClientHandler(socket);
            handler.start();
        }
    }

    // 메시지를 전체 클라이언트에게 전송
    public static void broadcast(String msg, ClientHandler sender) {
        synchronized (clients) {
            for (ClientHandler handler : clients.values()) {
                if (handler != sender)
                    handler.send(msg);
            }
        }
    }

    // 귓속말 처리
    public static void whisper(String fromId, String toId, String message) {
        ClientHandler target = clients.get(toId);
        if (target != null) {
            target.send(fromId + " 님이 다음의 귓속말을 보내셨습니다: " + message);
        }
        else {
            ClientHandler sender = clients.get(fromId);
            if (sender != null) {
                sender.send(toId + " 님은 존재하지 않습니다.");
            }
        }
    }

    public static void addClient(String clientId, ClientHandler handler) {
        clients.put(clientId, handler);
    }

    public static void removeClient(ClientHandler handler) {
        clients.remove(handler);
    }
}
