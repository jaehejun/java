package java0708;

class Circle {
    int radius;
    String color;
    static int numberOfCircles;
    Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}
public class CircleEx {
    int a = 40;
    public static void main(String[] args) {
        Circle c1 = new Circle(100, "red");
        Circle c2 = new Circle(50, "yellow");
        c1.numberOfCircles++;
        System.out.println(c1.numberOfCircles);
        c2.numberOfCircles++;
        c2.numberOfCircles++;
        System.out.println(c2.numberOfCircles);
//        print();
//        System.out.println(a); // static 메소드 내에서는 this 키워드 사용할 수 없음
    }
    static void print() {
        System.out.println("print() 호출됨");
    }
}

