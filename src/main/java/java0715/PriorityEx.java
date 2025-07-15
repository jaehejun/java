package java0715;

class PriorityThread extends Thread {
    // 쓰레드 생성시 이름 지정하기 위해 매개변수 생성자 정의 -> super() 부모 생성자 호출
    public PriorityThread(String name) { super(name); }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + " 번째 ");
            System.out.print("실행중인 쓰레드 이름 : " + Thread.currentThread().getName());
            System.out.println(" --> 쓰레드 우선 순위 : " + Thread.currentThread().getPriority());
        }
    }
}
public class PriorityEx {
    public static void main(String[] args) {
        PriorityThread p1 = new PriorityThread("높음");
        PriorityThread p2 = new PriorityThread("중간");
        PriorityThread p3 = new PriorityThread("낮음");
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MIN_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
    }
}
