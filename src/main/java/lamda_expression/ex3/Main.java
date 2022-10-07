package lamda_expression.ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // printing all of them
        numbers.forEach((n) -> {System.out.println(n);});
    }
}
