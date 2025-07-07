package java0707;

public class IncrementEx {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("increment() 메소드 호출 전의 x: " + x);
        increment(x);
        System.out.println("incremenent() 메소두 호출 후의 x : " + x);
    }
    public static void increment(int n) {
        System.out.println("increment() 메소드 시작 시의 n: " + n);
        n++;
        System.out.println("increment() 메소드 종료 시의 n: " + n);
    }
}