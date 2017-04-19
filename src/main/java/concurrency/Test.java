package concurrency;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;

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

        Thread thread = new Thread();
        thread.start();
        try {
            thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Executors.newCachedThreadPool();
        Runtime runtime = Runtime.getRuntime();

    }
}
