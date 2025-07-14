package java0709;

class Person {
    String name = "사람";
    void showInfo() {
        System.out.println("나는 " + name);
    }
}

class Student extends Person {
    String major="컴퓨터";
    void work() {
        System.out.println(major + "를 공부한다.");
    }
}

public class PersonEx {
    public static void main(String[] args) {
//        Student s = new Student();
//        System.out.println(s.name);
//        s.showInfo();
//
//        // 자식 클래스의 레퍼런스 값을 부모 클래스 레퍼런스에 대입 : 업캐스팅
//        Person p1 = s;
//        Student s1 = (Student)p1; // 다운캐스팅 : 업캐스팅이 선행되어야 함
//        System.out.println(p1.name);
//        // 자식 객체의 멤버나 메서드 접근 불가
////        System.out.println(p1.major);
//        System.out.println(s1.major);
//
//        Person p2 = new Person();
//        Student s2 = (Student)p2; // 강제 타입변환시 오류 발생
//        System.out.println(s2.major);
        Person p1 = new Person();
        Student s2 = new Student();
        System.out.println(s2 instanceof Person);
        Person p2 = s2;
        System.out.println(p2 instanceof Student);
        Student s = (Student)p2;
        System.out.println(p1 instanceof Student); // false
        System.out.println(s2 instanceof Student);
        System.out.println(p2 instanceof Student);
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);


        Object obj = "Hello";
        // JDK 15 이하
        if (obj instanceof String) {
            String ss = (String)obj; // 명시적 형변환 필요
            System.out.println(ss.length());
        }
        // JDK 16 이상 - 패턴 매칭
        // obj가 String 인 경우 -> 자동으로 s라는 지역 변수로 바인딩
        if (obj instanceof String ss) {
            System.out.println(ss.length());
        }
    }
}
