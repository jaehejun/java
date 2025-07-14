package java0709;

interface Resizable {
    void resize(int percent);
}

interface GeomericObject {
    double getPerimeter();
    double getArea();
}

class Circle implements GeomericObject {
    protected double radius = 1.0;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("Circle[radius=%.1f]", radius);
    }
}

class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent) {
        this.radius = radius * (1 + percent/100.0);
        System.out.printf("크기를 %d퍼센트 크게 변경 후\n", percent);
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]의 둘레는 %.1f, 면적은 %.1f", super.toString(), getPerimeter(), super.getArea());
    }
}
public class CircleEx {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println(c.toString());
        ResizableCircle r = new ResizableCircle(3);
        System.out.println(r.toString());
        r.resize(10);
        System.out.println(r.toString());
    }
}
