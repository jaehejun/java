package java0714;

import java.util.HashMap;
import java.util.Map;

public class CountWordEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] sample = {"to", "be", "or","not","to","be","is","a","problem"};
        // 문자열에 포함된 단어의 빈도 카운트
        for (String a : sample) {
            Integer freq = map.get(a);
            map.put(a, (freq ==null) ? 1 : freq + 1);
        }
        System.out.println(map.size() + "단어가 있습니다.");
        System.out.println(map.containsKey("to"));
        System.out.println(map.isEmpty());
        System.out.println(map);
    }
}
