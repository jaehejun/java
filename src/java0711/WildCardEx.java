package java0711;

import java.util.List;

public class WildCardEx {
    // 와일드카드를 이용한 리스트 출력 메소드
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Integer 리스트
        List<Integer> integers = List.of(1,2,3,4,5);
        System.out.println("숫자리스트");
        printList(integers);

        // String 리스트
        List<String> strings = List.of("apple", "orange", "banana");
        System.out.println("문자열 리스트");
        printList(strings);
    }
}
