package passing_mechanism;

public class Main {
    public static void main(String[] args) {
        // pass by value
        Dog dog = new Dog("Max");
        checkName(dog);
        dog.getName().equals("Max");// true
        dog.getName().equals("Kiki"); // false

        int a =2;
        modify(a);
        System.out.println(a);
    }

    public static void modify(int a){
        a =5;
    }

    public static void checkName(Dog d){
        d.getName().equals("Max");//true
        d = new Dog("Kiki");
        d.getName().equals("Kiki");//true

        //pass by reference
        //d.setName("Kiki");
    }


}
