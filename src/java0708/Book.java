package java0708;

class Book {
    String title;
    String author;
    int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String title, int ISBN) {
        this(title,"Anonymous",ISBN);
    }
    public Book() {
        this(null, null, 0); // 생성자 규칙 : this(...)가 첫줄에 있어야 함
        System.out.println("생성자가 호출되었음");
    }
    public static void main(String[] args) {
        Book javaBook = new Book("날개", "이상", 3333);
        Book holyBible = new Book("Holy Bible", 1);
        Book emptyBook = new Book();
    }
}
