package overriding_and_overloading;

public class Cow extends Mammal{
    private String size;

    public Cow(String name, int age, String size) {
        super(name, age);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void changeInfo(String name, int age) {
        System.out.print("Info are changed to ");
        super.changeInfo(name, age);
    }

    @Override
    public void changeInfo(String name) {
        System.out.print("the present info are ");
        super.changeInfo(name);
    }

    @Override
    public String changeInfo() {
        System.out.print("The animal is ");
        return super.changeInfo();
    }

    @Override
    public void run() {
        System.out.println("Cow running");
    }
}
