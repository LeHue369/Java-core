package interface_and_abstract_class;

//-- Purpose: providing a base for subclasses
// - Subclasses extends => implementing or overriding the methods.
public abstract class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    //- Abstract method don't have body
    //- If we want to have multiple class inheritance => use interface instead
    public void work(){
        System.out.println("Hue");
    }
    public void changeName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: "+ this.name + ", Gender: " + this.gender;
    }
}
