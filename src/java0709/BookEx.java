package java0709;

import java.util.Scanner;

import static java.lang.System.exit;

class Author {
    String name;
    String email;
    String gender;

    public Author() {}
    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return String.format("Author[name=%s, email=%s, gender=%s]", name, email, gender);
    }
}

class Book {
    static int num = 0;
    String title;
    Author author;
    double price;
    int qty;

    public Book() { num++; }
    public Book(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
        num++;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return String.format("Book[name=%s, %s, price=%.1f, qty=%d", title, author.toString(), price, qty);
    }
}
public class BookEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[10];
        Author[] authors = new Author[10];
        int index = 0;

        String[] menus = new String[5];
        menus[0] = "1.도서 정보 입력";
        menus[1] = "2.도서 목록 보기";
        menus[2] = "3.검색하기(제목)";
        menus[3] = "4.수량정보(여성작가수량/보유도서수량)";
        menus[4] = "5.프로그램종료";

        for (String menu : menus) {
            System.out.print(menu + " | ");
        }

        while (true) {
            switch (scan.nextInt()) {
                case 1: {
                    String[] inputs = scan.nextLine().split(" ");
                    authors[index] = new Author(inputs[1], inputs[2], inputs[3]);
                    books[index] = new Book(inputs[0], authors[index], Double.parseDouble(inputs[4]), Integer.parseInt(inputs[5]));
                    index++;
                    break;
                }
                case 2: {
                    for (Book book : books) {
                        System.out.println(book.toString());
                    }
                    break;
                }
                case 3: {
                    System.out.print("제목을 입력하세요 -->> ");
                    String input = scan.next();
                    for (Book book : books) {
                        if (book.getTitle().equals(input)) {
                            System.out.println(book.toString());
                        }
                    }
                    break;
                }
                case 4: {
                    int count = 0;
                    for (Book book : books) {
                        if (book.author.getGender().equals("f"))
                            count++;
                    }
                    System.out.printf("여성작가도서/총보유도서 : (%d/%d\n)", count, Book.num);
                }
                case 5: {
                    exit(0);
                }
            }
        }
    }
}
