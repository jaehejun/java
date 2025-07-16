package java0716;

import java.io.IOException;

public class ReadWriteEx {
    public static void main(String[] args) throws IOException {

        int b, len = 0;
        int bArray[] = new int[100];

        System.out.println("--- 입력 스트림 ---");
        while ((b = System.in.read()) != '\n') { // 엔터키 입력할떄까지
            System.out.printf("%c(%d)", (char) b, b);
//            System.out.println(b);    // -> ascii 숫자만 출력됨
            bArray[len++] = b;
        }

        System.out.println("\n\n--- 출력 스트림 ---");
        for (int i = 0; i < len; i++) {
            System.out.write(bArray[i]); // print vs write
        }
        System.out.flush(); // System.out.close();
    }
}
