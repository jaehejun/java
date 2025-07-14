package java0709;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("포인트 이동 전");
    }

    @Override
    public void moveUp() {
        this.y -= this.ySpeed;
        System.out.println("포인트 위로 이동");
    }

    @Override
    public void moveDown() {
        this.y += this.ySpeed;
        System.out.println("포인트 아래로 이동");
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("포인트 왼쪽으로 이동");
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("포인트 오른쪽으로 이동");
    }

    public String toString() {
        return String.format("MovablePoint[x=%d, y=%d, xSpeed=%d, ySpeed=%d]", x, y, xSpeed, ySpeed);
    }
}

class MovableCircle extends MovablePoint implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.y -= this.ySpeed;
        System.out.println("원 위로 이동");
    }

    @Override
    public void moveDown() {
        this.y += this.ySpeed;
        System.out.println("원 아래로 이동");
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("원 왼쪽으로 이동");
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("원 오른쪽으로 이동");
    }

    @Override
    public String toString() {
        return String.format("MovableCircle[center=%s, radius=%d", super.toString(), radius);
    }
}
public class MovableEx {
    public static void main(String[] args) {
        Movable mp = new MovablePoint(5, 6, 10, 15);
        System.out.println(mp.toString());
        mp.moveLeft();
        System.out.println(mp.toString());
        mp.moveUp();
        System.out.println(mp.toString());

        Movable mc = new MovableCircle(1,2,3,4,20);
        System.out.println(mc.toString());
        mc.moveRight();
        System.out.println(mc.toString());
        mc.moveDown();
        System.out.println(mc.toString());

    }
}
