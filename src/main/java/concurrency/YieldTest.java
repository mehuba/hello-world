package concurrency;

/**
 * Created by Nico on 5/16/17 17:04.
 */
public class YieldTest {

    private static final Object lock = new Lock();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                synchronized (lock) {
                    System.out.println(this.getClass());
                    for (int i = 0; i < 10; i++) {
                        if (i == 5) {
                            Thread.yield();
                        }
                        print(i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        print(i);
                    }
                }
            }
        }).start();

    }

    private static void print(int i) {
        System.out.println(Thread.currentThread() + "i:" + i);
    }

    private static class Lock {
    }
}
