package Group10Project.test;

public class ShortCircuitTest {
    public static void test(){
        int a = 5;
        if (a < 10 || a / 0 == 1)
        {
            System.out.println("Short-circuit hoat dong dung");
        }
    }
}