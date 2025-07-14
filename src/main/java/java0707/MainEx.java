package java0707;

// Run - Edit Configurations - Build And Run

public class MainEx {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.printf("숫자들의 합은 %d\n", sum);
    }
}
