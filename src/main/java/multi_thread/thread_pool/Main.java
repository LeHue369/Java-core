package multi_thread.thread_pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    //- Executor, run the runnable method without creating new threads
    //- Method of executor:
    //+ SingleThreadExecutor()
    //+ FixedThreadPool(n)+
    //+ CachedThreadPool()
    //+ ScheduledExecutor
    public static void main(String[] args) {
//        //+ newSingleThreadExecutor()
//        System.out.println("+ Result of newSingleThreadExecutor:  ");
//        Executor executor = Executors.newSingleThreadExecutor();
//        executor.execute(() -> System.out.println("Hello World"));
//
//        //+FixedThreadPool(n)+=> assign the size of the pool
//        System.out.println("+ Result of newFixedThreadPool:  ");
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Runnable processor1 = new MessageProcessor(2);
//        executorService.execute(processor1);
//
//        Runnable processor2 = new MessageProcessor(3);
//        executorService.execute(processor2);
//
//        Runnable processor3 = new MessageProcessor(4);
//        executorService.execute(processor3);
//
//        Runnable processor4 = new MessageProcessor(4);
//        executorService.execute(processor4);
//
//        executorService.shutdown(); // rejects any new tasks from being submitted
//        executorService.shutdownNow(); // Terminate the executor service immediately....
//
//
//        System.out.println("submitted all tasks....");

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        executor.submit(() ->{
            Thread.sleep(1000);
            return null;
        });

        executor.submit(() ->{
            Thread.sleep(1000);
            return null;
        });

        executor.submit(() ->{
            Thread.sleep(1000);
            return null;
        });

        System.out.println("number of threads: " + executor.getPoolSize());
        System.out.println("number of waiting tasks: " + executor.getQueue());

    }
}
