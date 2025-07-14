package java0714;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

interface Mathematical {
    double calculate(double d);
}
interface Pickable {
    char pick(String s, int i);
}
interface Computable {
    int compute(int x, int y);
}
class Utils {
    int add(int a, int b) {
        return a + b;
    }
}
public class MethodRefEx {
    public static void main(String[] args) {
        Mathematical m;
        Pickable p;
        Computable c;
        // m = d -> Math.abs(d);
        m = Math::abs;
        System.out.println(m.calculate(-50.3));

        // p = (a, b) -> a.charAt(b);
        p = String::charAt;
        System.out.println(p.pick("Hello Java~", 4));

        Utils utils = new Utils();
        // c = (a, b) -> utils.add(a,b);
        c = utils::add;
        System.out.println(c.compute(20, 30));

        //Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("코난");
        set.add("장미");
        set.add("미란");

        // iterator 이용한 요소 반복 처리
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
        System.out.println();

        //Stream 이용한 요소 반복 처리
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }

}
