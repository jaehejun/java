package java0716;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public class FileStreamEx {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/test1.txt");

        os.write((byte)10);
        os.write((byte)20);
        os.write((byte)30);
        os.flush();
        os.close();

        InputStream is = new FileInputStream("/c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/test1.txt");

        int data;
        while ((data = is.read()) != -1) {
            System.out.println(data);
        }
        is.close();
    }
}
