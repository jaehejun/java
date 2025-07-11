package java0711;


import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("MakeSound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

public class AnimalEx {
    // <? extends T>를 사용하는 메소드 : 읽기 전용
    public static void printSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
    // <? super T>를 사용하는 메소드 : 쓰기 전용
    public static void addDog(List<? super Dog> dogs) {
        dogs.add(new Dog());
    }

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        // <? extends T>를 사용한 메소드 호출
        printSound(dogList);
        printSound(catList);

        // <? super T>를 사용한 메소드 호출
        List<Object> objectList = new ArrayList<>();
        objectList.add(new Dog());
        objectList.add(new Animal());
        objectList.add(new Object());
        addDog(objectList);
//        printSound(objectList);
    }
}
