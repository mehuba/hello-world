package concurrency;

/**
 * Created by Nico on 6/14/17 16:15.
 */
public class EqualTest {

    public static void main(String[] args) {
        A a = new A(0);
        A t = a;
        A p = t;
        a.value++;
        if (p == t) {
            System.out.println("Yes");
        }
    }
}

class A {
    public int value;

    public A(int value) {
        this.value = value;
    }
}
