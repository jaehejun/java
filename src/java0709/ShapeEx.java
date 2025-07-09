//package java0709;
//
//abstract class Shape {
//    abstract double calArea();
//}
//
//class Circle extends Shape {
//    double radius;
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    public double calArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    double width;
//    double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public double calArea() {
//        return width * height;
//    }
//}
//
//public class ShapeEx {
//    public static void main(String[] args) {
//        Shape[] shapes = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
//        double sum = 0;
//        for (Shape shape : shapes) {
//            sum += shape.calArea();
//        }
//        System.out.println("면접의 합: " + sum);
//    }
//}
