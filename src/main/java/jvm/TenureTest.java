package jvm;

/**
 * Created by Nico on 6/21/17 15:11.
 */
public class TenureTest {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] a1, a2, a3;

        a1 = new byte[_1MB / 4];
        a2 = new byte[_1MB * 4];
        a3 = new byte[_1MB * 4];
        a2 = null;
        a3 = new byte[_1MB * 4];

    }
}
