package java0716;

import java.io.*;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        File src = new File("c:/windows/system.ini"); // 소스 파일
        File dst = new File("c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/system.txt");

        int c;
        try (
                FileReader fr = new FileReader(src);
                FileWriter fw = new FileWriter(dst);
                BufferedReader in = new BufferedReader(fr);
                BufferedWriter out = new BufferedWriter(fw);
                ) {
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
