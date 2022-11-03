package multi_thread.monitor;

public class Thread2 extends Thread{

    SharedDataPrinter p;

    public Thread2(SharedDataPrinter p) {
        this.p = p;
    }

    public void run(){
        try {
            p.display(" for Geeks");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
