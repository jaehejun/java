package java0711;

import java.util.ArrayList;
import java.util.List;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        List<Point> pl = new ArrayList<Point>();
        pl.add(new Point(2, 3));
        pl.add(new Point(3, 4));
        pl.add(new Point(1, -6));

        for (int i = 0; i < pl.size(); i++) {
            System.out.println(pl.get(i));
        }

        for (Point p : pl) {
            System.out.println(p);
        }
    }
}
