package java0716;

import java.io.*;

public class BufferedStreamEx {
    public static void main(String[] args) throws IOException {

        String org = "c:/Program Files (x86)/Internet Explorer/iexplore.exe";
        String dst = "/c:/Users/campus2H052/desktop/untitled/src/main/java/java0716/temp/iexplore.exe";

        long start, end, duration;
        start = System.nanoTime();

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(org));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst));
                ) {
            while (bis.available() > 0) {
                int b = bis.read();
                bos.write(b);
            }
            bos.flush();
        } catch (Exception e) {}
        end = System.nanoTime();
        duration = end - start;
        System.out.println("버퍼를 사용한 경우: " + duration);

        start = System.nanoTime();
        try (
                FileInputStream fis = new FileInputStream(org);
                FileOutputStream fos = new FileOutputStream(dst);
                ) {
            while (fis.available() > 0) {
                int b = fis.read();
                fos.write(b);
            }
            fos.flush();
        } catch (Exception e) {}
        end = System.nanoTime();
        duration = end - start;
        System.out.println("버퍼를 사용하지 않은 경우: " + duration);
    }
}
