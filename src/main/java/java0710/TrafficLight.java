package java0710;

public class TrafficLight {
    // TrafficLight 클래스 내부에 enum 선언
    enum Signal { RED, GREEN }
    private Signal currentSignal;
    public TrafficLight() {
        // 기본값 RED
        this.currentSignal = Signal.RED;
    }
    public void changeSignal() {
        currentSignal = switch (currentSignal) {
            case RED -> Signal.GREEN;
            case GREEN -> Signal.RED;
        };
    }
    public Signal getCurrentSignal() {
        return currentSignal;
    }
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        System.out.println("Initial signal: " + trafficLight.getCurrentSignal());
        //신호바꾸고 출력
        trafficLight.changeSignal();
        System.out.println("Current signal: " + trafficLight.getCurrentSignal());
    }
}
