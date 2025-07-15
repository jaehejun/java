package java0715;

class PrintTable {
    //구구단 출력하는 동기화가 필요한 메소드, synchronized
    public synchronized void printTable(int n) {
        System.out.println(n + "단 출력");
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try { Thread.sleep(500); }
            catch (InterruptedException e) {}
        }
    }
}

class PrintThread extends Thread {
    PrintTable pt;
    int n;
    PrintThread(PrintTable pt, int n) {
        this.pt = pt;
        this.n = n;
    }
    @Override
    public void run() {
        pt.printTable(n);
    }
}

public class PrintThreadEx {
    public static void main(String[] args) {
        PrintTable pt = new PrintTable();
        PrintThread th1 = new PrintThread(pt, 2);
        PrintThread th2 = new PrintThread(pt, 5);
        th1.start();
        th2.start();
    }
}
