package java0707;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        countdown(5);

        Scanner scan = new Scanner(System.in);
        System.out.println("정수 2개를 입력하세요");
        printSum(scan.nextInt(), scan.nextInt());

    }

    public static void countdown(int n) {
        System.out.println("카운트다운 시작~");
        for (int i = n; i >= 0; i--) {
            System.out.println(i + "..");
        }
        System.out.println("발사!!");
    }

    public static void printSum(int first, int second) {
        int sum = 0;
        for (int i = first; i < second; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        sum += second;
        System.out.println(second + " = " + sum);
    }
}