package java0710;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String query = "name=conan&addr=ran's&age=10";
        StringTokenizer st = new StringTokenizer(query, "&");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(query, "&=");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}
