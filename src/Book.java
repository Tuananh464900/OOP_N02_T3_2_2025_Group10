public class Book {
    public String title;
    public String author;
    public int numPages;

    // Constructor mặc định
    public Book() {
        this.title = "";
        this.author = "";
        this.numPages = 0;
    }

    // Constructor đầy đủ
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book setNumPages(int numPages) {
        this.numPages = numPages;
        return this;
    }

    // 🟢 Đây là phương thức bị thiếu mà gây ra lỗi
    public Book incrementPages() {
        this.numPages++;  // tăng số trang lên 1
        return this;      // trả về chính đối tượng để method chaining
    }
}
