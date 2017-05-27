package concurrency;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Nico on 3/26/17 16:38.
 */
public class Test {
    public static void main(String[] args) {
        List<Object> list = Collections.synchronizedList(new ArrayList<Object>());
        Vector<Integer> integers = new Vector<Integer>();
        Hashtable hashtable = new Hashtable<Integer, Integer>();
        CopyOnWriteArrayList<Integer> li = new CopyOnWriteArrayList<Integer>();
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();

        Executors.newCachedThreadPool();
        Runtime runtime = Runtime.getRuntime();

        ReentrantLock lock = new ReentrantLock();

        Object o = new Object();
        try {
            o.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
        try {
            Integer element = queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
