package multi_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i<5; i++){
            MultithreadThing myThing = new MultithreadThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            //myThread.join(); --- stop others thread, wait for just one to be completely finished
            System.out.println(myThread.isAlive()); //--- check if threads are still alive
        }
    }

}
