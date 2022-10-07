package overriding_and_overloading;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Overloading
        Mammal mammal = new Mammal("Pig", 2);
        mammal.changeInfo("Whale", 10);
        System.out.println(mammal.getName()+" "+mammal.getAge());
        mammal.changeInfo("Hedgehog");
        System.out.println(mammal.getName()+" "+mammal.getAge());
        mammal.changeInfo();
        System.out.println(mammal.changeInfo());

        // Overriding
        System.out.println("---------");
        Cow cow = new Cow("Kiki", 2, "Big");
        cow.changeInfo("Momo", 10); System.out.print(cow.getName()+" "+cow.getAge() +" "+ cow.getSize()+"\n");
        cow.changeInfo("Hedgehog"); System.out.print(cow.getName()+" "+cow.getAge() + " " +cow.getSize()+"\n");
        System.out.println(cow.changeInfo());

        // Proving that overloading has compile-time polymorphism
        System.out.println("---------");
        ArrayList<Mammal> m = new ArrayList<>();
        m.add(new Cow("A", 2, "Big"));
        m.add(new Buffalo("B", 3));
        m.add(new Cow("C", 4, "Small"));
        m.add(new Buffalo("D", 5));
        m.add(new Cow("E", 6, "Big"));

        System.out.println("Result: ");
        for(int i = 0; i < m.size(); i++){
            if(m.get(i) instanceof Buffalo) m.get(i).run();
        }
        // Proving that overriding has run-time polymorphism
        System.out.println("---------");
        Buffalo buffalo = new Buffalo("Mimi", 100);
        buffalo.run();
        buffalo.run(11.2);
    }
}
