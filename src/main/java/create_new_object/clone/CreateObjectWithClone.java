package create_new_object.clone;

public class CreateObjectWithClone implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    int i;
    static int j = 10;
    CreateObjectWithClone() {
        i = j++;
    }
    @Override
    public String toString() {
        return "Value of i :" + i;
    }
}