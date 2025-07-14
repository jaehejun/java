package java0708;

class CellPhone {
    String model;
    String color;
    void powerOn() {
        System.out.println("전원을 켠다");
    }
    void powerOff() {
        System.out.println("전원을 끈다.");
    }
    void bell() {
        System.out.println("벨이 울린다");
    }
    void send(String message) {
        System.out.printf("발신자: %s\n", message);
    }
    void receive(String message) {
        System.out.printf("수신자: %s\n", message);
    }
    void hangup() {
        System.out.println("전화를 끊는다.");
    }
}

class DmbCellPhone extends CellPhone {
    int channel;
    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    void turnOnDmb() {
        System.out.printf("%d번 DMB 방송 수신을 시작한다.\n", channel);
    }
    void changeChannel(int channel) {
        this.channel = channel;
        System.out.printf("채널을 %d번으로 바꾼다.\n", channel);
    }
    void turnOffDmb() {
        System.out.printf("%d번 DMB 방송 수신을 종료한다.\n", channel);
    }
}
public class PhoneEx {
    public static void main(String[] args) {
        // 객체 생성
        DmbCellPhone phone = new DmbCellPhone("은하수폰", "실버", 10);
        // 상속받은 부모 필드
        System.out.printf("모델 : %s\n", phone.model);
        System.out.printf("색상 : %s\n", phone.color);
        // 자식의 필드
        System.out.printf("채널 : %s\n", phone.channel);
        // 상속받은 부모 메소드 호출
        phone.bell();
        phone.send("여보세요");
        phone.receive("안녕하세요! 저는 코난이에요");
        phone.hangup();
        // 자식의 메소드 호출
        phone.turnOnDmb();
        phone.changeChannel(20);
        phone.turnOffDmb();
    }
}
