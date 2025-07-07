package java0707;

class Person{
    String name;
    int age;

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PersonEx {
    public static void main(String args[]) {
        // 인스턴스화 --> 생성자 호출
        Person aPerson = new Person("conan");
        System.out.println(aPerson.age);
        aPerson.age = 10;
        int i = aPerson.age;
        String s = aPerson.getName();
        System.out.println(s);
        System.out.println(i);
        aPerson.setName("detective");
        System.out.println(aPerson.getName());

        Person[] pa;
        pa = new Person[5];
        for (int j = 0; j < pa.length; j++) {
            pa[j] = new Person();
            pa[j].age = 30 + j;
        }
        for (int j = 0; j < pa.length; j++) {
            System.out.print(pa[j].age + " ");
        }
    }

}
