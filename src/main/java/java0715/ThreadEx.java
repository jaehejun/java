package java0715;

class TimerThread extends Thread {  // Thread 상속
    int n = 0;
    @Override
    public void run() { // run() 오버라이딩
        while(true) {
            System.out.println(n);
            n++;
            try {
                Thread.sleep(1000); // 1초 동안 sleep
            }
            catch(InterruptedException e) {
                return;
            }
        }
    }
}
public class ThreadEx {
    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        th.start();
    }
}
