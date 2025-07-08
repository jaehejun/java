package java0708.Ex01;

class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
    public String toString() {
        return String.format("Rectangle[length=%.1f, width=%.1f]", getLength(), getWidth());
    }
}
public class RectangleEx {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r2.setLength(3.0);
        r2.setWidth(4.0);
        System.out.printf("%s의 둘레는 %.1f, 면적은 %.1f\n", r1.toString(), r1.getPerimeter(), r1.getArea());
        System.out.printf("%s의 둘레는 %.1f, 면적은 %.1f\n", r2.toString(), r2.getPerimeter(), r2.getArea());
    }
}
