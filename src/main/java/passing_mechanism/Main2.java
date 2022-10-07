package passing_mechanism;

public class Main2 {
    public static void main(String[] args) {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        // Before Modification
        System.out.println(a.num);
        System.out.println(b.num);

        modify(a, b);

        // After Modification
        System.out.println(a.num);
        System.out.println(b.num);
    }
    public static void modify(Foo a1, Foo b1) {
        a1.num++;

        b1 = new Foo(1);
        b1.num++;
    }
}
