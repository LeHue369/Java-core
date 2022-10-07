package passing_mechanism;

public class Dog {
    private String name;
    public int num;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
