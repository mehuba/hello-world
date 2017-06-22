package jvm;

/**
 * Created by Nico on 6/22/17 11:27.
 */
public class ByteCodeTest {

    private int m;

    public int inc() {
        int x;

        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
