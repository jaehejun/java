package java0715;

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용 저장..");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            save();
        }
    }
}

public class DaemonEx {
    public static void main(String[] args) {
        AutoSaveThread at = new AutoSaveThread();
        // 데몬쓰레드 설정이 없으면 at가 참조하는 객체는 일반 작업 쓰레드임 -> JVM 종료되지 않음
        at.setDaemon(true); // 메인쓰레드 종료되면 함께 종료됨
        at.start();
        try { Thread.sleep(3000); }
        catch (InterruptedException e) {}
        System.out.println("메인쓰레드 종료");
    }
}
