package java0716;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        try (
                InputStreamReader reader = new InputStreamReader(System.in);
                FileWriter writer = new FileWriter("/c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/fileWriterEx.txt");
                ) {
            int c;
            System.out.println("문자를 입력하세요. 엔터를 누르면 종료");
            while ((c = reader.read()) != -1) {
                if (c == '\n') break;
                writer.write(c);
            }
            System.out.println("입력이 종료됨");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
