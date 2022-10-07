package lamda_expression.ex1;

import java.lang.invoke.StringConcatException;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int comparison = stringComparator.compare("Hello", "World");// Hello is before world
        System.out.println(comparison);

        //--------Using lambda expression------

        Comparator<String> stringComparatorLambda =
                (String o1, String o2) -> {return o1.compareTo(o2);};
        int lambdaComparison = stringComparatorLambda.compare("Hello", "World");
        System.out.println(lambdaComparison);
    }
}
