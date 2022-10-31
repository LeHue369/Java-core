package multi_thread.thread_priority;

public class Main {
    public static void main(String[] args) {

        // Thread with the highest priority will be executed first.
        // In case two threads have the same priority, the JVM will execute them in FIFO order.
        //Minimum priority(1)
        //Normal priority(5)
        //Maximum priority(10)
        //If set priority greater than 10, an exception will be thrown
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();

        //the result will be 5 as default priority is 5
        System.out.println("t1 threadPriority : " + t1.getPriority());
        System.out.println("t2 threadPriority : " + t2.getPriority());
        System.out.println("t3 threadPriority : " + t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 threadPriority : " + t1.getPriority());
        System.out.println("t2 threadPriority : " + t2.getPriority());
        System.out.println("t3 threadPriority : " + t3.getPriority());

        System.out.println("Current executing thread : " + Thread.currentThread().getName());
        System.out.println("Current executing priority : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Current executing priority : " + Thread.currentThread().getPriority());
    }
}
