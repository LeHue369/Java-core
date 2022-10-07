package synchronize_asynchronize.ex2;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        OnGeekEventListener mlistener = new A();
        obj.registerOnGeekEventListener(mlistener);
        obj.doGeekStuff();
    }
}
