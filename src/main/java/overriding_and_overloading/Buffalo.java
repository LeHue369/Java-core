package overriding_and_overloading;

public class Buffalo extends Mammal{

    public Buffalo(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Buffalo running");
    }
    public void run(double distance){
        System.out.println(distance);
    }
}
