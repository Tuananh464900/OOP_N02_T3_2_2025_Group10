package Group10Project.test;

public class CastingTest {
  public static void testDouble(){
    int a = 5;
    double b = a;
    System.out.println("Double: " + b);
  } 
public static void testFloat(){
    int a = 10;
    float f = (float) a / 3;
    System.out.println("Float: " + f);
}
public static void testCasting(){
    double d = 9.7;
    int i = (int) d;
    System.out.println("Casting double ve int: " + i);
  }
}