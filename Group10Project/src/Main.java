public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Lap trinh Java", "Nguyen Van A",180);
        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Number of Pages: " + myBook.numPages);

        Book chainedBook = new Book()
            .setTitle("Lap trinh C++")
            .setAuthor("Nguyen Van B")
            .setNumPages(200)
            .incrementPages();

        System.out.println("Thong tin sach sau method chainning:");
        System.out.println("Title: " + chainedBook.title);
        System.out.println("Author: " + chainedBook.author);
        System.out.println("Number of Pages: " + chainedBook.numPages);

        Book combinedBook = new Book("Lap trinh Python", "Nguyen Van C", 150)
            .incrementPages()
            .setTitle("Lap trinh Python - Advanced")
            .incrementPages();
        System.out.println("Thong tin sach ket hop:");
        System.out.println("Title: " + combinedBook.title);
        System.out.println("Author: " + combinedBook.author);
        System.out.println("Number of Pages: " + combinedBook.numPages);
    }
}
