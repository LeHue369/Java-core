package multi_thread.the_main_thread;

public class Main {
    public static void main(String[] args){
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t);

        t.setName("My Thread");
        System.out.println("After name change: " + t);

        for(int n = 5; n>0; n--){
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}
