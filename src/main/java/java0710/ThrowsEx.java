package java0710;

import java.util.Scanner;

public class ThrowsEx {

    private static void square(String str) throws NumberFormatException {
        int n = Integer.parseInt(str);
        System.out.println(n * n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            square(scan.next());
        } catch (NumberFormatException e) {
            System.out.println("정수가 아닙니다.");
        }
    }
}
