public class TestBook {
    public static void main(String[] args) {
        // 1. Test constructor và in thông tin cơ bản
        Book myObj = new Book("a", "b", 2);
        System.out.println("Test 1 - Thong tin sach co ban:");
        System.out.println("Title: " + myObj.title);
        System.out.println("Author: " + myObj.author);
        System.out.println("Pages: " + myObj.numPages);

        System.out.println("\n-------------------\n");

        // 2. Test method chaining
        Book chainedBook = new Book()
            .setTitle("Sach Test")
            .setAuthor("Tac Gia Test")
            .setNumPages(100)
            .incrementPages()
            .incrementPages();

        System.out.println("Test 2 - Method chaining:");
        System.out.println("Title: " + chainedBook.title);
        System.out.println("Author: " + chainedBook.author);
        System.out.println("Pages: " + chainedBook.numPages);  // Expected: 102

        System.out.println("\n-------------------\n");

        // 3. Test kết hợp constructor và method chaining
        Book combinedBook = new Book("Sach A", "Tac Gia A", 50)
            .incrementPages()
            .setTitle("Sach A - Phiên bản mới")
            .incrementPages();

        System.out.println("Test 3 - Ket hop constructor va method chaining:");
        System.out.println("Title: " + combinedBook.title);
        System.out.println("Author: " + combinedBook.author);
        System.out.println("Pages: " + combinedBook.numPages);  // Expected: 52
    }
}
