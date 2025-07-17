package Group10Project.src;

import java.util.Random;

public class randNum {
    public static int RandNum(){
        Random rand = new Random();
        return rand.nextInt(100);
    }
}