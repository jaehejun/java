package java0708.Ex01;

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        return salary * percent / 100;
    }
    public String toString() {
        return String.format("Employee[id=%d, name=%s, salary=%d]", id, name, salary);
    }
}
public class EmployeeEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "코난", 25000000);
        Employee e2 = new Employee(2, "장미", 30000000);
        Employee e3 = new Employee(3, "미란", 40000000);

        System.out.printf("%s의 연봉은 %d 월급 인상분은 %d\n", e1.toString(), e1.getAnnualSalary(), e1.raiseSalary(10));
        System.out.printf("%s의 연봉은 %d 월급 인상분은 %d\n", e2.toString(), e2.getAnnualSalary(), e2.raiseSalary(10));
        System.out.printf("%s의 연봉은 %d 월급 인상분은 %d\n", e3.toString(), e3.getAnnualSalary(), e3.raiseSalary(10));
    }
}
