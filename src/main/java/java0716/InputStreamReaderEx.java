package java0716;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args) throws IOException {
        try (
                FileInputStream fis = new FileInputStream("/c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/가나다라마바사.txt");
                InputStreamReader is = new InputStreamReader(fis, "UTF-8");
//                InputStreamReader is = new InputStreamReader(fis, "EUC-KR");
//                InputStreamReader is = new InputStreamReader(fis, "MS949");
                ) {
            int c;
            System.out.println("인코딩 문자 집합은 " + is.getEncoding());
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
