package mutable_Immutable_String_StringBuilder_StringBuffer.additionalStuff;

import java.util.Arrays;

public class JavaStringIsImmutable {
    public static void main(String[] args) {
        //invoke to the same String object in memory
        String name = "John is coding";
        String anotherName = "John is coding";

        //Create a new object outside string pool
        String aThirdName = new String("John is coding");

        System.out.println(name == anotherName);
        System.out.println(name == aThirdName);

        addMoneyToAccount(name, 20000);

        // something I can do with sttring
        name.charAt(1); // => o
        name.indexOf('o'); //=> 1
        String[] trySplit = name.split(" ");
        Arrays.stream(trySplit).forEach(System.out::println);// john- is - coding

    }

    // security reason
    public static void addMoneyToAccount(String accountHolder, int money){
        //body
    }
}
