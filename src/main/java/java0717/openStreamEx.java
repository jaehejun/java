package java0717;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class openStreamEx {
    public static void main(String[] args) {
        try {
            // URL 객체 생성
            URL url = new URL("https://en.wikipedia.org");
            // 입력 스트림 생성
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

//            // openConnection()으로 입력 스트림 생성
//            URLConnection uc = url.openConnection();
//            BufferedReader in2 = new BufferedReader(new InputStreamReader(uc.getInputStream()));

            // 저장할 파일 경로 및 이름 지정
            BufferedWriter out = new BufferedWriter(new FileWriter("wikipedia.html"));

            String inputLine;
            while ((inputLine = in.readLine()) != null) { // 한 행씩 읽음
                System.out.println(inputLine);
                out.write(inputLine);
                out.newLine();
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("URL에서 데이터를 읽는 중");
        }
    }
}
