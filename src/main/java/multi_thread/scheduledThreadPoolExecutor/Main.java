package multi_thread.scheduledThreadPoolExecutor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
//        executorService.schedule(() -> {
//            System.out.println("Hello World");
//        }, 60, TimeUnit.SECONDS);
        CountDownLatch lock = new CountDownLatch(3);

        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
        ScheduledFuture<?> future = service.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
            lock.countDown();
        }, 500, 100, TimeUnit.MILLISECONDS);

        lock.await(1000, TimeUnit.MILLISECONDS);
        future.cancel(true);
    }
}
