package concurrency.ch1;

/**
 * Created by Nico on 3/9/17 21:40.
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }
}
