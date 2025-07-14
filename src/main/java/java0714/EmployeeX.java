package java0714;

import lombok.Getter;
import lombok.ToString;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Getter
@AllArgsConstructor
@ToString
public class EmployeeX {
    private String name;
    private float salary;
    private String gender;

    public boolean isFemale() {
        return "F".equals(this.getGender());
    }

    public static void main(String[] args) {
        EmployeeX john = new EmployeeX("John", 1500, "M");
        EmployeeX sarah = new EmployeeX("Sarah", 2000, "F");
        EmployeeX charles = new EmployeeX("Charles", 1700, "M");
        EmployeeX mary = new EmployeeX("Mary", 5000, "F");
        EmployeeX sophie = new EmployeeX("Sophie", 7000, "F");

        List<EmployeeX> employees = Arrays.asList(john, sarah, charles, mary);

        // Predicagte<Employee> : Employee를 입력으로 받아 boolean을 반환하는 함수형 인터페이스
        Predicate<EmployeeX> predicate = e -> e.isFemale() && e.getSalary() > 2500;

        employees
                .stream()
                .filter(predicate) // 조건에 맞는 직원만 통과
                .forEach(e -> System.out.println(e.getName() + " : " + e.getSalary())); //통과된 직원에 대해 이름과 급여 출력

        List<String> list = Arrays.asList("a","b","c","d","e");

        List<String> newList = list
                .stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(newList);

        employees
                .stream()
                .map((e) -> new EmployeeX(e.getName(), e.getSalary() * 2, e.getGender()))
                .forEach(c -> System.out.println(c.getName() + " : " + c.getSalary()));

        Stream<String> s = Stream.of("banana","apple","cherry");
        s.sorted().forEach(System.out::println);

        // Employee 클래스가 Comparable을 구현하지 않았기 때문에 ClassCastException 발생
//        employees.stream().sorted().forEach(System.out::println);
    }
}
