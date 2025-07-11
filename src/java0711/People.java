package java0711;

import java.util.LinkedList;

public class People {
    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<String>();
        people.add("코난");
        people.add("장미");
        people.add("미란");
        System.out.println(people);

        people.add(1, "키드");
        System.out.println(people);
        people.set(2, "유탐정");
        System.out.println(people);

        people.removeFirst();
        people.removeLast();
        System.out.println(people);

        people.remove(1);
        System.out.println(people);
        System.out.println(people.size());
        System.out.println(people.get(0));
        System.out.println(people.contains("키드"));
        System.out.println(people.indexOf("키드"));
    }
}
