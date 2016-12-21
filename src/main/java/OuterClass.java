import java.util.Date;

interface Destination {
    String readLabel();
}

abstract class Contents {
    abstract public int value();
}

/**
 * Created by Nico on 12/20/16 17:06.
 */
public class OuterClass {
    public static void main(String[] args) {
        System.out.println(new Date());
        OuterClass outerClass = new OuterClass();
        Contents cont = outerClass.cont();
        Destination dest = outerClass.dest("Tanzania");
        outerClass.new InnerDestination("");
    }

    public InnerContents cont() {
        return new InnerContents();
    }

    public Destination dest(String s) {
        return new InnerDestination(s);
    }

    protected class InnerDestination implements Destination {
        private String label;

        private InnerDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    private class InnerContents extends Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        Contents cont = outerClass.cont();
        System.out.println(cont.value());
        Destination dest = outerClass.dest("Tanzania");
        System.out.println(dest.readLabel());
    }
}
