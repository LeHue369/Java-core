package multi_thread.monitor;

public class SharedDataPrinter {

    synchronized public void display(String str) throws InterruptedException {
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            Thread.sleep(100);
        }
    }
}
