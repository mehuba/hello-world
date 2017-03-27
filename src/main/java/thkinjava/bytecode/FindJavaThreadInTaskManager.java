package thkinjava.bytecode;

/**
 * Created by Nico on 2/15/17 17:12.
 */
public class FindJavaThreadInTaskManager {
    public static void main(String[] args) {
        Thread thread = new Thread(new Worker());
        thread.start();
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Thread Name:" + Thread.currentThread().getName());
            }
        }
    }
}
