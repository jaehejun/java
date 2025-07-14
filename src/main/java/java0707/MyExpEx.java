package java0707;

class MyExp {
    int base;
    int exp;
    MyExp(int base, int exp) {
        this.base = base;
        this.exp = exp;
    }
    int getValue() {
        int result = 1;
        for (int count = exp; count > 0; count--)
            result *= base;
        return result;
    }
}

public class MyExpEx {
    public static void main(String[] args) {
        int base = 2;
        int exp = 3;
        MyExp myExp = new MyExp(base, exp);
        System.out.println(base + "의 " + exp + "승 = " + myExp.getValue());

        int base2 = 3;
        int exp2 = 4;
        MyExp myExp2 = new MyExp(base2, exp2);
        System.out.println(base2 + "의 " + exp2 + "승 = " + myExp2.getValue());

    }
}
