package java0715.BookStore;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Getter
@Setter
public class Order {
    private Customer customer;
    private Cart cart;
    private String address;

    public Order(Customer customer, Cart cart) {
        this.customer = customer;
        this.cart = cart;
    }
    public void display() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        System.out.println("-------------------배송 받을 고객 정보-------------------");
        System.out.println("고객명 : " + customer.getName() + " 연락처 : " + customer.getPhoneNumber());
        System.out.println("배송지 : " + getAddress() + " 발송일: " + today.format(fmt));
        System.out.println("장바구니 상품 목록 : ");
        System.out.println("-------------------");
        System.out.printf("%-15s | %-15s | %-15s\n", "도서ID","수량","합계");
        for (Map.Entry<Book, Integer> entry : cart.getItems().entrySet()) {
            Book book = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%-15s | %-15s | %-15s\n", book.getIsbn(),quantity,book.getPrice()*quantity);
        }
        System.out.println("-------------------");
        System.out.println("총액 : " + cart.calculateTotal());
    }
}
