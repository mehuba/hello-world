package thkinjava.framework;

import java.util.Vector;

/**
 * Created by Nico on 2/3/17 12:06.
 */
public class Controller {
    private void test() {

    }
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = new Integer(128);
        Integer c = 1000;
        Integer.valueOf(1000);

        System.out.println(a == 10);
        System.out.println(b == new Integer(128));
        System.out.println(c == 1000);

        ThreadLocal<Integer> hits = new ThreadLocal<Integer>();
    }

}
