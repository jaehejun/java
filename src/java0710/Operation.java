package java0710;

public enum Operation {
    ADD {
        public int apply(int x, int y) {
            return x + y;
        }
    },
    MULTIPLY {
        public int apply(int x, int y) {
            return x * y;
        }
    };
    public abstract int apply(int x, int y); //오버라이딩 강제
    //모든 enum 상수가 반드시 자신만의 로직을 가지게 됨

    public static void main(String[] args) {
        int resultAdd = Operation.ADD.apply(5,3);
        int resultMultiply = Operation.MULTIPLY.apply(4,7);
        System.out.println("덧셈 결과: " + resultAdd);
        System.out.println("곱섹 결과: " + resultMultiply);
    }
}
