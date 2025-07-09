package java0709;

import java.util.Scanner;

import static java.lang.System.exit;

class Author {
    private String name;
    private String email;
    private String gender;

    public Author() {}
    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return String.format("Author[name=%s, email=%s, gender=%s]", name, email, gender);
    }
}

class Book {
    private String title;
    private Author author;
    private double price;
    private int qty;

    public Book(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(Author author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }
    public void setQty(int qty) { this.qty = qty; }

    @Override
    public String toString() {
        return String.format("Book[name=%s, %s, price=%.1f, qty=%d", title, author.toString(), price, qty);
    }
}

class BookManager {
    private Book[] books = new Book[10];
    private int bookCount = 0;

    public void addBook(Book b) {
        if (bookCount >= books.length) {
            System.out.println("저장 공간이 부족합니다.");
            return ;
        }
        books[bookCount++] = b;
    }

    public void listBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].toString());
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println(books[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 제목의 책을 찾을 수 없습니다.");
        }
    }

    public void printStats() {
        int femaleCount = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().getGender().equals("f")) {
                femaleCount++;
            }
        }
        System.out.printf("여성작가도서/총보유도서 : (%d/%d)\n", femaleCount, bookCount);
    }

    public void exit() {
        System.out.println("프로그램을 종료합니다.");
    }
}
public class BookEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookManager manager = new BookManager();

        while (true) {
            System.out.println("1.도서 정보 입력 | 2.도서 목록 보기 | 3.검색하기(제목) | 4.수량정보(여성작가수량/보유도서수량) | 5.프로그램종료");
            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("책제목, 저자, 이메일, 성별, 가격, 수량 순으로 입력하시오 -->>");
                    String title = scan.next();
                    String name = scan.next();
                    String email = scan.next();
                    String gender = scan.next();
                    double price = scan.nextDouble();
                    int qty = scan.nextInt();

                    Author author = new Author(name, email, gender);
                    Book book = new Book(title, author, price, qty);
                    manager.addBook(book);
                    break;

                case 2:
                    manager.listBooks();
                    break;

                case 3:
                    System.out.print("제목을 입력하세요 -->> ");
                    String input = scan.next();
                    manager.searchByTitle(input);
                    break;

                case 4:
                    manager.printStats();
                    break;

                case 5:
                    manager.exit();
                    System.exit(0);

                default:
                    System.out.println("올바른 메뉴를 선택해 주세요.");
            }
        }
    }
}
