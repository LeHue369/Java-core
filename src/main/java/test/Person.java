package test;

public class Person {

    private int sum;

    public Person() {
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }


    public void increase(int amount){
        sum += amount;
    }
}
