package finalVariable_FinalMethod_FinalClass;

public class Main {
    public static void main(String[] args) {
        // 1. classes marked as final can't be extended
        // 2. methods marked as final can't be overridden
        // 3. variables marked as final can't be reassigned
        final int MAX_NUMBER; //= 10;
        // 4. arguments marked as final can't be changed inside methods

        //-- use setter when need changing things in class
         Animal animal = new Animal("Kiki", "Whale");
         animal.setName("Momo");
    }
}
