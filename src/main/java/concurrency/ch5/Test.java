package concurrency.ch5;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Nico on 5/10/17 00:24.
 */
public class Test {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.get(0);
        vector.size();

        Map<String, String> map0 = new HashMap<String, String>();
        map0.put("bb", "bb");

        Map<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("a","aa");

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("aaa");

    }
}
