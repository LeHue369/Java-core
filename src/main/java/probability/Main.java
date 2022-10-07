package probability;

import io.vavr.Lazy;

import java.util.SplittableRandom;
import java.util.function.Supplier;

public class Main {
    private final Lazy<SplittableRandom> random =
            Lazy.of(SplittableRandom::new);
    public static void main(String[] args) {
//        SplittableRandom random = new SplittableRandom();
//        boolean probablyFalse = random.nextInt(10) == 0;
//        System.out.println(probablyFalse);
//        boolean whoKnows = random.nextInt(1, 101) <= 50;
//        System.out.println(whoKnows);

        // only return 10%, which is lesser than 10, of the numbers
        withProbability(1,2,10);
    }


    public static int withProbability(int a1,int a2,
                                 int probability){
        SplittableRandom random = new SplittableRandom();
        if(random.nextInt(1,101) <= probability){
            return a1;
        }else{
            return a2;
        }
    }
}
