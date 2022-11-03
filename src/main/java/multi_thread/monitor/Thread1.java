package multi_thread.monitor;

public class Thread1  extends Thread{
    SharedDataPrinter p;

    public Thread1(SharedDataPrinter p) {
        this.p = p;
    }

    public void run(){
        try {
            p.display("Geeks");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
