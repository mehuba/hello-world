package jvm;

/**
 * Created by Nico on 6/20/17 10:40.
 */
public class StackOverFlowTest {

    private int stackLength = 1;
    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        StackOverFlowTest test = new StackOverFlowTest();
        try {
            test.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + test.stackLength);
            throw e;
        }
    }

}
