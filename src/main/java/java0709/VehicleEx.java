package java0709;

class Vehicle {
    void run() {
        System.out.println("차량이 달린다.");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("자동차가 부르릉 달린다.");
    }
    void stop() {
        System.out.println("자동차를 멈춘다.");
    }
}
public class VehicleEx {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.stop();

        Vehicle v = new Car(); // 타입 변환(업캐스팅)
        v.run(); // 오버라이딩된 메서드 실행
//        v.stop(); // 오류발생
    }
}
