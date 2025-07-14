package java0707;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요");
        int studentNum = scan.nextInt();
        int [] scores = new int[studentNum];
        char [] grades = new char[studentNum];
        for (int i = 0; i < studentNum; i++) {
            System.out.println(i+"번 학생의 점수를 입력하세요");
            scores[i] = scan.nextInt();
            if (scores[i] >= 90)
                grades[i] = 'A';
            else if (scores[i] >= 80)
                grades[i] = 'B';
            else if (scores[i] >= 70)
                grades[i] = 'C';
            else if (scores[i] >= 60)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }
        System.out.println(studentNum + "명의 학생 성적은 다음과 같습니다.");
        for (int score : scores)
            System.out.print(score + " ");
        System.out.println();
        for (int i = 0; i < studentNum; i++) {
            System.out.println(i + "번 학생의 등급은 " + grades[i] + "입니다.");
        }
    }
}
