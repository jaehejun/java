package java0711;

class MyClass<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}
public class MyClassEx {
    public static <T> MyClass<T> method1(T t) {
        MyClass<T> mine = new MyClass<T>();
        mine.set(t);
        return mine;
    }
    public static void main(String[] args) {
        MyClass<Integer> mine1 = method1(1); // T를 Integer로 대체
        System.out.println(mine1.get());
        MyClass<String> mine2 = method1("one"); //T를 String으로 대체
        System.out.println(mine2.get());
    }
}
