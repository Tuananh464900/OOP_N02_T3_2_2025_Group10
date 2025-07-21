public class TestFlower {
    public static void main(String[] args) {
        System.out.println("=== TEST CLASS FLOWER ===");

        // Test constructor mặc định
        Flower f1 = new Flower();
        f1.display();

        System.out.println("-------------------");

        // Test constructor với int
        Flower f2 = new Flower(5);
        f2.display();

        System.out.println("-------------------");

        // Test constructor với String
        Flower f3 = new Flower("Rose");
        f3.display();

        System.out.println("-------------------");

        // Test constructor kết hợp String và int
        Flower f4 = new Flower("Tulip", 6);
        f4.display();
    }
}
class Flower {
    int petalCount = 0;
    String s = "null";

    // Constructor với int
    Flower(int petals) {
        petalCount = petals;
    }

    // Constructor với String
    Flower(String ss) {
        s = ss;
    }

    // Constructor kết hợp String và int
    Flower(String s, int petals) {
        this.s = s;
        this.petalCount = petals;
    }

    // Constructor mặc định
    Flower() {
        this("hi", 47);
    }

    // Phương thức hiển thị thông tin
    void display() {
        System.out.println(s + " - " + petalCount);
    }
}

