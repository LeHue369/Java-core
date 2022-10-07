package overriding_and_overloading;

public class Mammal implements Activity{
    private String name;
    private int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void changeInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void changeInfo(String name){
        this.name = name;
    }

    public String changeInfo(){
        if(this.age < 5) return "Young";
        return "Old";
    }

    @Override
    public void run() {

    }
}
