package java0708;

class Person {
    String name;
    String addr;

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String toString() {
        return String.format("Person[name=%s, addr=%s]", name, addr);
    }
}

class Student extends Person {
    String program;
    int year;
    double fee;

    public Student(String name, String addr, String program, int year, double fee) {
        super(name, addr);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public String toString() {
        return String.format("Student[%s, program=%s, year=%d, fee=%.1f]", super.toString(), program, year, fee);
    }
}

class Staff extends Person {
    String shcool;
    double pay;

    public Staff(String name, String addr, String shcool, double pay) {
        super(name, addr);
        this.shcool = shcool;
        this.pay = pay;
    }
    public String getShcool() {
        return shcool;
    }
    public void setShcool(String shcool) {
        this.shcool = shcool;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString() {
        return String.format("Staff[%s, shcool=%s, pay=%.1f]", super.toString(), shcool, pay);
    }
}
public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("코난", "미란이네");
        Student s1 = new Student("장미", "브라운 박사님댁", "생명과학", 1, 25000);
        Student s2 = new Student("미란", "미란이네", "태권도", 3, 3000);
        Staff f1 = new Staff("유명한", "미란이네", "청솔대학", 20);

        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(f1.toString());
    }
}
