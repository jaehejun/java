package java0716;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordFrequencyEx {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("찾고 싶은 단어는 무엇입니까? ");
            String target = sc.nextLine();

            int count = 0;
            try (
                    BufferedReader br = new BufferedReader(new FileReader("dorian.txt"))
                    ) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split("[.,\"\'\\s]");
                    for (String word : words) {
                        if (word.equals(target))
                            count++;
                    }
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (count == 0)
                System.out.println("찾는 값이 없습니다.");
            else
                System.out.println(count + "번 사용됨.");
        }
    }
}
