package concurrency.ch1;

/**
 * Created by Nico on 3/9/17 21:48.
 */
@ThreadSafe
public class Sequence {

    private int value;

    public synchronized int getNext() {
        return value++;
    }
}
