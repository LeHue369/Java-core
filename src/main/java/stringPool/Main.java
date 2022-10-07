package stringPool;

public class Main {
    public static void main(String[] args) {
        String first = "example";
        String second = "example";
        System.out.println(first == second);//true

        String third = new String("example");
        String fourth = new String("example");
        System.out.println(third == fourth); // false

        String fifth = "example";
        String sixth = new String("example");
        System.out.println(fifth == sixth);// false

        // Manual interning
        System.out.println(fifth == sixth.intern());//true
    }

}
