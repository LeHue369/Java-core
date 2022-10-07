package interface_and_abstract_class;

public class Main {
    public static void main(String[] args) {
        //-- Note: Abstract class in java can’t be instantiated.
        // For example: Person student = new Person("Tom", "Male");
           Person student1 = new Employee(0, "Tom", "Male");
           Person student2 = new Employee(0, "Hue", "Female");
           student1.work();


           //----------------
           Employee student11 = new Employee(0, "Tom", "Male");
           Employee student22 = new Employee(0, "Hue", "Female");
           student11.work();

           student1.changeName("Hanh");
           System.out.println(student1.toString());
           Employee employee = new Employee(1, "Hue", "Female");
           employee.goOut();
           employee.eat();
           employee.sleep();
    }
}
