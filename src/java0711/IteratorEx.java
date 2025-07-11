package java0711;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        List<Point> pl = new ArrayList<Point>();
        pl.add(new Point(2,3));
        pl.add(new Point(3,4));
        pl.add(new Point(1,-6));

        Iterator<Point> it = pl.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
