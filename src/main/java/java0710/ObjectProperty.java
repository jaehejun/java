package java0710;

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Object에 선언된 메소드 toString() 오버라이딩
    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object point) {
        if (point instanceof Point) {
            Point p = (Point) point;
            if (x == p.x && y == p.y)
                return true;
            else
                return false;
        }
        return false;
    }
}

public class ObjectProperty {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = new Point(3,4);
        if (a == b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
//        System.out.println(p.getClass().getName());
//        System.out.println(p.hashCode());
//        System.out.println(p.toString());
//        System.out.println(p);
    }
}
