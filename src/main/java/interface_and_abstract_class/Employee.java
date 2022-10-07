package interface_and_abstract_class;

public class Employee extends Person implements Activity {
    private int empId;

    public Employee(int empId, String name, String gender) {
        super(name, gender);
        this.empId = empId;
    }

    @Override
    public void work() {
        if(empId == 0){
            System.out.println("Not norking");
        }
        else{
            System.out.println("Working as employee!!");
        }
        //super.work();
    }

    @Override
    public void goOut() {
        System.out.println("She is going out with her friends");
    }

    @Override
    public void eat() {
        System.out.println("She is eating");
    }

    @Override
    public void sleep() {
        System.out.println("She is sleeping");
    }
}
