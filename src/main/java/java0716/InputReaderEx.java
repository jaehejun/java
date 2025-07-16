package java0716;

import java.io.*;

public class InputReaderEx {
    public static void main(String[] args) throws IOException {
        String line = null;
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 콘솔 입력
//                BufferedReader br = new BufferedReader(new FileReader("c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/가나다라마바사.txt"));
                PrintWriter pw = new PrintWriter(new FileWriter("c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/test4.txt"));
                ) {
            while (((line = br.readLine()) != null)) {
                if (line.equals("exit"))
                    break;
                System.out.println(line); // 콘솔 출력
                pw.println(line); // 파일에 출력
            }
            pw.flush();
            pw.close();
        } catch (IOException e) {}
    }
}
