package java0715.BookStore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class BookStore {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("ISBN1234", "셜록홈즈", 20000, "코난 도일", "그 누구도 뛰어넘지 못했던 추리 소설의 고전", "추리소설", LocalDate.of(2018, 10, 8)));
        bookList.add(new Book("ISBN2345", "도리안 그레이의 초상", 16000, "오스카 와일드", "예술을 위한 예술!", "고전소설", LocalDate.of(2022, 1, 22)));
        bookList.add(new Book("ISBN3456", "쥐덫", 27000, "애거서크리스티", "폭설 속에 갇힌 몽스웰 여관 - 네 명의 손님과 주인 부부, 그리고 한 명의 형사", "추리소설", LocalDate.of(2019, 6, 10)));

        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 ");
        String name = scan.next();
        System.out.print("연락처를 입력하세요 ");
        String phoneNumber = scan.next();

        Customer customer = new Customer(name, phoneNumber);
        Cart cart = new Cart();
        Order order = new Order(customer, cart);

        printGreetings();

        while (true) {
            printMenu();
            switch (scan.nextInt()) {
                case 1 -> System.out.println("현재 고객 정보 : \n" + customer.toString());
                case 2 -> cart.display();
                case 3 -> {
                    for (Book book : bookList) {
                        System.out.println(book.toString());
                    }
                    System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
                    String isbn = scan.next();
                    System.out.println("장바구니에 추가하시겠습니까? Y | N");
                    String choice = scan.next();
                    if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("yes")) {
                        Book selected = findBookByIsbn(isbn, bookList);
                        cart.addBook(selected);
                    }
                }
                case 4 -> {
                    cart.display();
                    System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
                    String isbn = scan.next();
                    Book selected = findBookByIsbn(isbn, bookList);
                    cart.removeBook(selected);
                }
                case 5 -> cart.removeAll();
                case 6 -> {
                    System.out.print("배송받을 분은 고객정보와 같습니까? ");
                    String res = scan.next();
                    if (res.equalsIgnoreCase("Y") || res.equalsIgnoreCase("yes")) {
                        System.out.print("배송지를 입력해주세요 ");
                    }
                    String address = scan.next();
                    order.setAddress(address);
                    order.display();
                }
                case 7 -> System.exit(0);
                default -> System.out.println("올바른 메뉴 번호를 선택해주세요");
            }
        }

    }
    public static void printGreetings() {
        System.out.println("**********************************************************");
        System.out.println("오늘의 선택, 코난문고\n영원한 스테디셀러, 명탐정 코난시리즈를 만나보세요~");
    }
    public static void printMenu() {
        System.out.println("**********************************************************");
        System.out.println("1. 고객 정보 확인하기 2. 장바구니 상품 목록 보기\n3. 바구니에 항목 추가하기 4. 장바구니의 항목 삭제하기\n5. 장바구니 비우기 6. 영수증 표시하기 7. 종료");
        System.out.println("**********************************************************");
        System.out.print("메뉴 번호를 선택해주세요 ");
    }
    public static Book findBookByIsbn(String isbn, List<Book> bookList) {
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn))
                return book;
        }
        return null;
    }
}
