package java0714;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "바나나");
        map.put(2, "사과");
        map.put(3, "오렌지");
        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        System.out.println("----------------------------------------");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "바나나");
        map2.put(2, "사과");
        map2.put(3, "오렌지");
        map2.put(1, "포도"); // 키 중복 발생
        for (Map.Entry m : map2.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        System.out.println("----------------------------------------");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1, "바나나");
        map3.put(2, "사과");
        map3.put(3, "오렌지");
        for (Map.Entry m : map3.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        map3.remove(1);
        System.out.println("삭제 후 -------------------------");
        for (Map.Entry m : map3.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
