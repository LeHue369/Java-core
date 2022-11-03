package multi_thread.monitor;

public class Main {
    public static void main(String[] args) {
        SharedDataPrinter printer = new SharedDataPrinter();

        Thread1 t1 = new Thread1(printer);
        Thread2 t2 = new Thread2(printer);

        t1.start();
        t2.start();
    }
}
