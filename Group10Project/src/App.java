package Group10Project.src;
// import src.Time; // Remove this import if Time.java is in the default package

public class App {
    public static void main(String[] args) throws Exception {

    Time t = new Time(20, 3, 45);
    System.out.println(t.toString());
    
    System.out.println(Recursion.factorial(12));

    }
} 