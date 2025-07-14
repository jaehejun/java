package java0711;

import java.util.Comparator;

class Fruit {
    private String name;
    public Fruit(String name) { this.name = name;}
    public String getName() { return name; }
}

class Apple extends Fruit {
    public Apple(String name) { super(name); }
}

class Orange extends Fruit {
    public Orange(String name) { super(name); }
}

public class FruitComparator implements Comparator<Fruit>{
    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {
        // 사전 순으로 비교
        return fruit1.getName().compareTo(fruit2.getName());
    }
    public static void main(String[] args) {
        //Fruit을 비교하는 Comparator
        Comparator<? super Fruit> fc = new FruitComparator();
        //Fruit 객체 생성
        Fruit banana = new Fruit("Banana");
        Apple redApple = new Apple("Red Apple");
        Orange orange = new Orange("Orange");
        System.out.println(banana instanceof Fruit);
        System.out.println(redApple instanceof Fruit);
        //비교 예제
        int result1 = fc.compare(banana, redApple);
        int result2 = fc.compare(redApple, orange);
        System.out.println("Result 1: " + result1); // 결과가 양수면 banana가 더 큼
        System.out.println("Result 2: " + result2); // 결과가 음수면 redApple이 더 큼
    }
}
