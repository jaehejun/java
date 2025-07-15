package java0715.BookStore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "이름 " + name + " 연락처 " + phoneNumber;
    }
}
