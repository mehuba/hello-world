package thkinjava.inner.inherit;

/**
 * Created by Nico on 12/22/16 10:52.
 */
public class Egg {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }
        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();

    public Egg() {
        System.out.println("New Egg2()");
    }
    public void insertYolk(Yolk y) {
        this.y = y;
    }
    public void g() {
        y.f();
    }
}
