package java0716;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopyEx {
    public static void main(String[] args) {
        String src = "c:/windows/system.ini";
        String dest = "/c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/copy.ini";

        try (   // try with resource -> 자동 close
                FileInputStream fis = new FileInputStream(src);
                FileOutputStream fos = new FileOutputStream(dest);
                ) {
            int c;
            while ((c = fis.read()) != -1)
                fos.write(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
