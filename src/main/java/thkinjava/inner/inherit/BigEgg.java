package thkinjava.inner.inherit;

/**
 * Created by Nico on 12/22/16 10:57.
 */
public class BigEgg extends Egg {
    private static int i = 1;
    public class Yolk extends Egg.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }
    public BigEgg() {
        insertYolk(new Yolk());
//        insertYolk(new Egg.Yolk());
    }

    public static void main(String[] args) {
        Egg egg = new BigEgg();
        egg.g();
    }
}
