package java0711;

public class GenericEx {
    //제한된 타입 파라미터로 숫자 타입(Number 타입)만 받아들이는 제네릭 메소드
    public static <T extends Number> double add(T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

    public static void main(String[] args) {
        Integer iNum1 = 5;
        Integer iNum2 = 10;
        Double dNum1 = 7.5;
        Double dNum2 = 3.2;

        int num1 = 1;
        int num2 = 2;

        System.out.println("정수의 합: " + add(iNum1, iNum2));
        System.out.println("실수의 합: " + add(dNum1, dNum2));
        System.out.println("int 합: " + add(num1, num2));
    }
}
