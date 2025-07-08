package java0708;

class A {
    public A() {
        System.out.println("A 객체 생성");
    }
    public A(int x) {
        System.out.println("매개변수 있는 생성자 A");
    }
}
class B extends A {
    public B() {
        System.out.println("B 객체 생성");
    }
    // 서브클래스에 매개변수 있는 생성자는 슈퍼클래스의 기본생성자와 짝을 이룸
    public B(int y) {
        System.out.println("매개변수 있는 생성자 B");
    }
}
class C extends B {
    public C() {
        System.out.println("C 객체 생성");
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        C c;
        c = new C();
    }
}
