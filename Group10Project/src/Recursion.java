package Group10Project.src;


public class Recursion {

    // Tính giai thừa n! bằng đệ quy
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Dãy Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Test
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("Fibonacci(6) = " + fibonacci(6));
    }
}
