package java0709;

interface A {
    void method1();
    default void method2() {
        System.out.println("인터페이스 A 내부의 method2");
    }
}

class C1 implements A {
    @Override
    public void method1() {
        System.out.println("클래스 C1 내부의 method1");
    }
}

class D1 implements A {
    @Override
    public void method1() {
        System.out.println("클래스 D1 내부의 method1");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        A obj1 = new C1();
        A obj2 = new D1();
        obj1.method1();
        obj1.method2();
        obj2.method1();
        obj2.method2();
    }
}
