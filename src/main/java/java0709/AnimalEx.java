package java0709;

abstract class Animal {
    String name;
//    void makesound() {
//        System.out.println("소리를 내다");
//    }
    abstract void makeSound();
}

class Mouse extends Animal {
    void makeSound() {
        System.out.println("찍찍");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("야옹");
    }
}
public class AnimalEx {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal dog = new Dog();
        Animal cat = new Cat();

        mouse.makeSound();
        dog.makeSound();
        cat.makeSound();

        Animal[] animals = {new Cat(), new Dog(), new Mouse()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
