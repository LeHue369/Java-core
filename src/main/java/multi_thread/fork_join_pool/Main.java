package multi_thread.fork_join_pool;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5,
                new TreeNode(3), new TreeNode(2,
                new TreeNode(2), new TreeNode(8)));

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        int sum = forkJoinPool.invoke(new CountingTask(tree));

        System.out.println(sum);
    }
}
