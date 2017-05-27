package concurrency.ch8;

import java.util.concurrent.*;

/**
 * Created by Nico on 5/16/17 01:06.
 */
public class Test {
    public static void main(String[] args) {
        final int N_CPU = Runtime.getRuntime().availableProcessors();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(N_CPU, N_CPU, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(10);

        Executors.unconfigurableExecutorService(executor);


    }

    class MyThreadFactory implements ThreadFactory {
        private final String poolName;

        public MyThreadFactory(String poolName) {
            this.poolName = poolName;
        }

        public Thread newThread(Runnable r) {
            return null;
        }
    }
}
