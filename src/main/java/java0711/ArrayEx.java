package java0711;

import java.util.ArrayList;
import java.util.Scanner;

class Grade {
    public static String getGrade(Integer score) {
        if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else if (score >= 60)
            return "D";
        else
            return "F";
    }
}
public class ArrayEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        while (true) {
            System.out.print("점수를 입력하세요 : ");
            int score = scan.nextInt();
            if (score == -1)
                break;
            scores.add(score);
        }
        System.out.println("학생들의 성적: " + scores);
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%d 학생의 성적은 %d점이며 학점은 %s이다\n", i, scores.get(i), Grade.getGrade(scores.get(i)));
        }
    }
}
