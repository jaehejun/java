package java0708.Ex01;

class Circle {
    private double radius = 1.0;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public double getCircumference() {
        return this.radius * 2 * Math.PI;
    }
    public String toString() { // 클래스 정보를 문자열로 반환
        return String.format("Circle[radius=%.1f]", radius);
    }
}
public class CircleEx {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        System.out.printf("%s의 둘레는 %.2f, 면적은 %.2f\n", c1.toString(), c1.getCircumference(), c1.getArea());
        System.out.printf("%s의 둘레는 %.2f, 면적은 %.2f\n", c2.toString(), c2.getCircumference(), c2.getArea());
    }
}
