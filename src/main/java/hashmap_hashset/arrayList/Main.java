import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //For tranditional Array
        String[] fruits =  new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[1]);

        //For ArrayList
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        System.out.println(fruitList);

        //Qestion 1: How to remove duplicates from ArrayList in Java?
        //I can remove duplicates from ArrayList by converting it into a Set and then back to ArrayList,
        // but how will I keep the order intact?
        Set<String> fruitListWithoutDuplicates = new LinkedHashSet<>(fruitList);
        fruitList.clear();
        fruitList.addAll(fruitListWithoutDuplicates);

        System.out.println("list of primesWithoutDuplicates without duplicates : " + fruitListWithoutDuplicates);


    }
}
