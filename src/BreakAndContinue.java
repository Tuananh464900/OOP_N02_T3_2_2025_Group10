public class BreakAndContinue{
  public static void breakandcontinue(int n){
    for (int i = 0; i<n;i++){
        if (i == 5) break;
        System.out.println("Break tai: " + i);
    }
  }
  public static void WhileTest(int n){
    int i = 0;
    while (i<n){
        if (i == 3){
            i++;
            continue;
        }
        System.out.println("While: " + i);
        i++;
    }
  }
  public static void DoWhileTest(int n){
    int i = 0;
    do{
        System.out.println("DoWhile: " + i);
        i++;
    }while (i < n);
  }
}