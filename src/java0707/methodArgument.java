package java0707;

public class methodArgument {
    public static void main(String[] args) {
        int x = 0;
        int[] y = {0};

        // 메소드 인자로 값 전달(call by value)
        System.out.println("increment() 메소드 호출 전의 x: " + x);
        increment(x);
        System.out.println("increment() 메소드 호출 후의 x: " + x);

        // 메소드 인자로 배열 전달(call by reference)
        System.out.println("호출 전 y[0] = " + y[0]);
        increment(y);
        System.out.println("호출 후 y[0] = " + y[0]);
    }
    public static void increment(int n) {
        System.out.println("increment() 메소드 시작 시의 n: " + n);
        n++;
        System.out.println("increment() 메소드 종료 시의 n: " + n);
    }

    public static void increment(int[] n) {
        System.out.print("increment() 메소드 내부임");
        System.out.print("n[0] = " + n[0] + " ---> ");
        n[0]++;
        System.out.println("n[0] = " + n[0]);
    }
}
