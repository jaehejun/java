package java0710;

interface MyButton {
    void click();
}
public class SmartPhoneEx {
    public static void main(String[] args) {
        MyButton btnCall = new MyButton() {
            public void click() {
                System.out.println("통화버튼이 눌렸음");
            }
        }; // 통화 버튼을 위한 익명 구현객체 생성
        btnCall.click();

        MyButton btnStop = new MyButton() {
            public void click() {
                System.out.println("통화종료버튼이 눌렸음");
            }
        }; // 통화 종료 버튼을 위한 익명 구현객체 생성
        btnStop.click();
    }
}
