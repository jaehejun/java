package java0715.BookStore;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Cart {
    private Map<Book, Integer> items = new HashMap<Book, Integer>();

    public void addBook(Book book) {
        int quantity = items.getOrDefault(book, 0);
        items.put(book, quantity + 1);
    }
    public void removeBook(Book book) {
        if (items.containsKey(book)) {
            items.remove(book);
        }
        System.out.println("장바구니에서 " + book.getIsbn() + "가 삭제되었습니다");
    }
    public void removeAll() {
        items.clear();
        System.out.println("장바구니를 비웠습니다");
    }
    public void display() {
        System.out.println("장바구니 상품 목록 : ");
        System.out.println("-------------------");
        System.out.printf("%-15s | %-15s | %-15s\n", "도서ID","수량","합계");
        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%-15s | %-15s | %-15s\n", book.getIsbn(),quantity,book.getPrice()*quantity);
        }
        System.out.println("-------------------");
    }
    public int calculateTotal() {
        return items.entrySet().stream()
                .mapToInt(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }
}
