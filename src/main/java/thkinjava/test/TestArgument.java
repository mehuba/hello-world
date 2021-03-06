package thkinjava.test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Nico on 12/14/16 10:31.
 */
public class TestArgument {

    static Gizmo gizmo;

    static void increment(int i) {
        i++;
    }

    static void testHandle(Gizmo gizmo) {
//        gizmo = new thkinjava.test.Gizmo(2);
        gizmo.setI(2);
    }

    public static void main(String[] args) {
        int i = 1;
        increment(i);
        System.out.println(i);
        Gizmo gizmo = new Gizmo(1);
        testHandle(gizmo);
        gizmo.print();
    }
}

class Gizmo {
    private int i;

    public Gizmo(int i) {
        this.i = i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void print() {
        System.out.println(i);
    }

    final private void method() {}

}

class childGizmo extends Gizmo {

    public childGizmo(int i) {
        super(i);
    }

    // not a override method
    void method() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        LinkedList<Integer> integers1 = new LinkedList<Integer>();
    }
}
