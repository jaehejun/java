package java0716;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("c:/windows/system.ini");
        String res;
        if (file.isFile())
            res = "파일";
        else
            res = "디렉터리";
        System.out.println(file.getPath() + "은 " + res + "입니다.");

        File file2 = new File("c:/windows/");
        File[] fs = file2.listFiles();
        for (File f : fs) {
            if (f.isDirectory())
                System.out.printf("dir: %s\n", f);
            else
                System.out.printf("file: %s(%d bytes)\n", f, f.length());
        }
    }
}
