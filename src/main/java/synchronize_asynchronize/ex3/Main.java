package synchronize_asynchronize.ex3;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        OnGeekEventListener mListener = new A();
        obj.registerOnGeekEventListener(mListener);
        obj.doGeekStuff();
    }
}
