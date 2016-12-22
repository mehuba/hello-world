package inner.scope;

/**
 * Created by Nico on 12/21/16 16:47.
 */
public class Parcel {
    /**
     * the creation of an entire class within the scope of a method
     * @param s
     * @return
     */
    public Destination dest(String s) {
        class InnerDestination implements Destination {
            private String label;

            private InnerDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new InnerDestination(s);
    }

    public Destination destAnonymous(String s) {
        return new Destination() {
            @Override
            public String readLabel() {
                return s;
            }
        };
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Destination d = parcel.dest("Tanzania");
        System.out.println(d.readLabel());
    }
}
