package java0714;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calSalary(double bonus) {
        return this.salary + bonus;
    }
}

public class ReflectionEx {
    public static void main(String[] args) throws Exception {
        //Employee에 해당하는 Class 객체 가져오기
        Class<?> employeeClass = Class.forName("java0714.Employee");

        //calculateSalary 메서드 객체(Method object)를 가져오기
        Method calculateSalaryMethod = employeeClass.getDeclaredMethod("calSalary", double.class);

        //Employee 객체 생성하기
        Object employeeInstance = employeeClass.getConstructor(String.class, double.class)
                .newInstance("John", 50000.0);

        //invoke() 메소드로 런타임에 동적으로 실행
        double bonus = 2000;
        double totalSalary = (double)calculateSalaryMethod.invoke(employeeInstance, bonus);

        System.out.println("Total salary: " + totalSalary);

        System.out.println("---------------------------------------------------");
        Class<?> employeeClass2 = Class.forName("java0714.Employee");

        //Employee 객체 생성하기
        Object employeeInstance2 = employeeClass2.getConstructor(String.class, double.class).newInstance("conan", 50000.0);

        //private filed 'salary' 가져오기
        Field salaryField = employeeClass2.getDeclaredField("salary");

        //private 필드이기 때문에 접근할 수 있도록 설정
        salaryField.setAccessible(true);

        //salary field의 현재값 읽어오기
        double currentSalary = (double)salaryField.get(employeeInstance2);
        System.out.println("Current salary: " + currentSalary);

        //salary filed 수정하기
        salaryField.set(employeeInstance2, 55000.0);

        //salary field의 수정된 값 읽어오기
        double updatedSalary = (double)salaryField.get(employeeInstance2);
        System.out.println("Updated salary: " + updatedSalary);
    }
}
