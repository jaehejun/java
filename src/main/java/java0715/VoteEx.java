package java0715;

class VoteThread extends Thread {
    public VoteThread(String name) {
        super(name);
    }
    private int voteRate = 0;
    @Override
    public void run() {
        try {
            while (true) {
                int increaseRate = (int) (Math.random() * 5) + 1;
                String voteStr = "";

                if (voteRate + increaseRate >= 100) {
                    increaseRate = 100 - voteRate;
                }
                voteRate += increaseRate;

                for (int i = 0; i < voteRate; i++) {
                    voteStr += "*";
                }
                System.out.println(Thread.currentThread().getName() + " 개표율:" + voteRate + "%(개표증가율:" + increaseRate + "%)" + voteStr);
                if (voteRate >= 100) return;
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            return;
        }
    }
}

public class VoteEx {
    public static void main(String[] args) {
        VoteThread v1 = new VoteThread("제1지역구");
        VoteThread v2 = new VoteThread("제2지역구");
        VoteThread v3 = new VoteThread("제3지역구");

        try {
            v1.start();
            v2.start();
            v3.start();
        }
        catch (Exception e) {}
    }
}
