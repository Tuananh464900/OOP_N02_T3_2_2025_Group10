public class Flower {
    int petalCount = 0;
    String s = "null";

    Flower(int petals) {
        petalCount = petals;
    }

    Flower(String ss) {
        s = ss;
    }

    Flower(String s, int petals) {
        this.s = s;
        this.petalCount = petals;
    }

    Flower() {
        this("hi", 47);
    }
}

// Lớp chứa main, không public
class MainClass {
    public static void main(String[] args) {
        Flower f = new Flower("TestFlower", 12);
        System.out.println(f.s + " - " + f.petalCount);
    }
}
