package finalVariable_FinalMethod_FinalClass;

public final class Animal {
    private String name;
    private String kind;

    public Animal(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }
    public void changeName(String name/*final int age*/){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
