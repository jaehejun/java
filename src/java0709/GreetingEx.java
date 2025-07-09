package java0709;

interface Greeting {
    default void sayHello() {
        printMessage("Hello!");
    }
    default void sayGoodbye() {
        printMessage("Goodbye!");
    }
    // private 메소드 : 중복 로직을 여기서 처리
    private void printMessage(String msg) {
        System.out.println("[Greeting]" + msg);
    }
}

class SimpleGreeting implements Greeting {
    // 구현 필요 없음 (default 메소드만 사용)
}

public class GreetingEx {
    public static void main(String[] args) {
        Greeting g = new SimpleGreeting();
        g.sayHello();
        g.sayGoodbye();
    }
}
