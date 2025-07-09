package java0709;

interface Alarm {
    // 추상 메소드 선언 --> abstract와 public 키워드는 생략 가능
    abstract public void playMusic(String title);
    abstract public void beep();
}

interface Messenger {
    void sendMessage(String phoneNumber, String msg);
    void receiveMsg();
}

interface Phone {
    void call(String phoneNumber);
    void receive();
}

class SmartPhone implements Alarm, Phone, Messenger {
    private String phoneNumber;
    public void playMusic(String title) {
        System.out.printf("[%s]이 재생됨\n", title);
    }
    @Override
    public void beep() {
        for (int i = 0; i < 3; i++) {
            System.out.println("삐이익 ~ ");
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String msg) {
        System.out.printf("[%s]로 메시지 전송: %s\n", phoneNumber, msg);
    }

    @Override
    public void receiveMsg() {
        System.out.println("메시지가 도착했음");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.printf("[%s]로 전화걸기 시도..rrr\n", phoneNumber);
    }

    @Override
    public void receive() {
        System.out.println("전화를 받음");
    }
}

public class SmartphoneTest {
    public static void main(String[] args) {
//        // SmartPhone 객체를 Alarm 인터페이스로 해석
//        Alarm a = new SmartPhone();
//        a.playMusic("비의 랩소디");
//        a.beep();

        SmartPhone sp = new SmartPhone();
        sp.playMusic("상어송");
        sp.beep();
        sp.call("010-1111-1111");
        sp.sendMessage("010-2222-2222", "내이름은 코난. 나는 탐정이죠");
    }
}
