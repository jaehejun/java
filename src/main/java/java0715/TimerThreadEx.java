package java0715;

class TimerThread2 extends Thread {
    int n = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println(n);
            n++;
            try { Thread.sleep(100); }  //0.1초동안 sleep
            catch (InterruptedException e) { return; }
        }
    }
}
public class TimerThreadEx {
    public static void main(String[] args) {
        TimerThread2 th = new TimerThread2();
        th.start();
        try { Thread.sleep(10000); } //10초동안 sleep
        catch (InterruptedException e) { e.printStackTrace(); }
        th.interrupt(); // 쓰레드 동작 10초 후에 종료
    }
}