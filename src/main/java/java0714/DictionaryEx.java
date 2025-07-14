package java0714;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryEx {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("love", "사랑");
        dict.put("apple", "사과");
        dict.put("baby", "아기");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("찾고 싶은 단어는? ");
            String key = scan.next();
            System.out.println(dict.get(key));
        }
    }
}
