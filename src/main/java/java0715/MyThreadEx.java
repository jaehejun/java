package java0715;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // sleep은 현재 실행중인 Thread를 일시 정지시켜 not runnable인 상태로
                Thread.sleep(1000);
                System.out.println(i + "번 : 작업쓰레드");
            } catch (InterruptedException e) {
                return; // 예외처리문
            }
        }
    }
}
public class MyThreadEx {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
//        thread.start();   // 쓰레드는 실행 후 destroyed 됨 -> start() 다시 호출 안됨
//        thread.run(); // run() 호출이 다 끝난 후에 for문 진입
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + "번 : main 쓰레드");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
